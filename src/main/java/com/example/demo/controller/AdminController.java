package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.GameDataBean;
import com.example.demo.bean.GameViewBean;
import com.example.demo.service.CaracterService;
import com.example.demo.service.GameService;

import lombok.RequiredArgsConstructor;

/**
 * 管理者用画面のコントローラー
 */
@Controller
@Secured("ROLE_ADMIN")
@RequiredArgsConstructor
public class AdminController {

	@Autowired
	private final GameService gameService;

	@Autowired
	private final CaracterService caraService;

	/**
	 * 管理者画面表示処理
	 * @param model Model
	 * @return
	 */
	@RequestMapping("/admin")
	public String admin(Model model) {

		return "cms_rpg_list/admin_top";
	}

	/**
	 * 登録作品編集・削除画面表示処理
	 * @param model Model
	 * @return
	 */
	@RequestMapping("/cms/edit")
	public String adminEdit(Model model) {

		List<GameViewBean> gameList = gameService.getAll();
		model.addAttribute("gameList", gameList);

		return "cms_rpg_list/cms_name_index";
	}


	/**
	 * ゲーム詳細データ画面表示
	 * @return
	 * @param model
	 * @param bookId
	 */
	@RequestMapping("/cms/game{id}") //http://localhost:8080/cms/edit
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

		return "cms_rpg_list/game_data_edit";
	}





}
