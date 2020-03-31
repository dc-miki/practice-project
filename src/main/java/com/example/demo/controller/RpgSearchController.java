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
import com.example.demo.form.CaracterForm;
import com.example.demo.form.GameForm;
import com.example.demo.form.ReviewForm;
import com.example.demo.service.CaracterService;
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

	@Autowired
	private final CaracterService caraService;

	/**
	 * ログイン後画面初期表示処理
	 * @param model Model
	 * @return
	 */
	@RequestMapping("/after_top")
	public String afterLogin(Model model) {

		return "rpg_list/after_login";
	}


	/**
	 * トップページ初期表示処理
	 * @param model Model
	 * @return
	 */
	@RequestMapping("/top")
	public String top(Model model) {

		return "rpg_list/top";
	}


	//ゲーム作品一覧画面
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
		@RequestMapping(value="/update", method = RequestMethod.POST)
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
		@RequestMapping("/caracter{id}") //http://localhost:8080/cms/edit
		public String caraRegist(@PathVariable(name = "id", required = true) int gameId,Model model) {

			CaracterForm form = new CaracterForm();
			model.addAttribute("form", form);

			return "common/caracter_regist";
		}

		/**
		 * レビュー登録画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/review{id}") //http://localhost:8080/cms/edit
		public String caraReview(@PathVariable(name = "id", required = true) int gameId,Model model) {

			ReviewForm form = new ReviewForm();
			model.addAttribute("form", form);

			return "common/review_regist";


		}


		/**
		 * キャラクター登録処理命令
		 *
		 * @return
		 * @throws IOException
		 */
		@RequestMapping(value="/caraUpdate", method = RequestMethod.POST)
		public String caraNewData(@Validated CaracterForm form, BindingResult result, Model model) {

			if (result.hasErrors()) {
				return "rpg_list/edit";
			}

			caraService.update(form);
			return "redirect:/index";

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

		/**
		 * 検索画面表示
		 * @return
		 * @param model
		 * @param bookId
		 */
		@RequestMapping("/searchValue") //http://localhost:8080/cms/edit
		public String searchValue(Model model) {

			return "rpg_list/search";
		}


}
