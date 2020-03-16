package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.GameDataBean;
import com.example.demo.bean.GameViewBean;
import com.example.demo.form.GameForm;
import com.example.demo.service.GameService;

import lombok.RequiredArgsConstructor;

/**
 * RPGサーチのコントローラー
 */
@Controller
@Secured("ROLE_STAFF")
@RequiredArgsConstructor
public class RpgSearchController {

	@Autowired
	private final GameService gameService;


	/**
	 * 書籍一覧初期表示処理
	 * @param model Model
	 * @return
	 */
	@RequestMapping("/top")
	public String top(Model model) {

		return "rpg_list/top";
	}



	//書籍一覧画面
		/**
		 * 書籍一覧表示処理
		 * @param model Model
		 * @return
		 */
		@RequestMapping("/index")
		public String index(Model model) {

			List<GameViewBean> gameList = gameService.getAll();
			model.addAttribute("gameList", gameList);


			return "rpg_list/index";
		}

		/**
		 * ゲーム詳細データ画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/game{id}") //http://localhost:8080/cms/edit
		@Transactional
		public String gameData(@PathVariable(name = "id", required = true) int gameId,Model model) {

			//ゲーム詳細取得
			GameDataBean game = gameService.getData(gameId);
			model.addAttribute("game", game);

			//ゲームレビュー取得
			List<GameDataBean> review = gameService.getReview(gameId);
			model.addAttribute("review", review);

            //ゲームキャラクター取得
			List<GameDataBean> caracter = gameService.getCaracter(gameId);
			model.addAttribute("caracter", caracter);

			return "rpg_list/game_data";
		}

		/**
		 * 作品登録画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/edit") //http://localhost:8080/cms/edit
		public String regist(Model model) {

			GameForm form = new GameForm();
			model.addAttribute("form", form);

			return "rpg_list/edit";
		}

		/**
		 * 更新処理命令
		 *
		 * @return
		 * @throws IOException
		 */
		@RequestMapping(value = "/update", params = "new", method = RequestMethod.POST)
		public String newData(@Validated GameForm form, BindingResult result, Model model) throws IOException {

			if (result.hasErrors()) {
				return "rpg_list/edit";
			}

			gameService.update(form);
			return "redirect:/index";

		}

		/**
		 * キャラクター登録画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/caracter") //http://localhost:8080/cms/edit
		public String caraRegist(Model model) {

			return "common/caracter_regist";
		}

		/**
		 * キャラクター登録画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/review") //http://localhost:8080/cms/edit
		public String caraReview(Model model) {

			return "common/review_regist";
		}


		/**
		 * 検索画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/search") //http://localhost:8080/cms/edit
		public String search(Model model) {

			return "rpg_list/search";
		}


}
