package com.example.demo.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import com.example.demo.bean.GameDataBean;
import com.example.demo.bean.GameViewBean;
import com.example.demo.entity.GameCaracter;
import com.example.demo.entity.GameReview;
import com.example.demo.entity.GameWork;
import com.example.demo.form.GameForm;
import com.example.demo.repository.CaraRepository;
import com.example.demo.repository.DemoRepository;
import com.example.demo.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameService {

	//GameWorkのリポジトリ
	private final DemoRepository demoRepository;

	//GameReviewのリポジトリ
	private final ReviewRepository reviewRepository;

	//GameCaraのリポジトリ
	private final CaraRepository caraRepository;

	/**
	 * ゲーム一覧表示
	 * @return
	 */
	public List<GameViewBean> getAll() {

		List<GameWork> gameList = demoRepository.findAll();

		List<GameViewBean> gameViewBean = new ArrayList<GameViewBean>();

		for (GameWork list : gameList) {
			GameViewBean bean = new GameViewBean();
			bean.setGameId(list.getGameId());//ゲームID
			bean.setTitle(list.getTitle());//タイトル
			bean.setGameModel(list.getGameModel());//機種

			gameViewBean.add(bean);

		}
		return gameViewBean;
	}

	/**
	 * ゲーム詳細表示
	 * @return
	 */
	public GameDataBean getData(int gameId) {

		GameWork game = demoRepository.findById(gameId);

		GameDataBean bean = new GameDataBean();
		bean.setGameId(game.getGameId());//ゲームID
		bean.setTitle(game.getTitle());//タイトル
		bean.setGameModel(game.getGameModel());//機種
		bean.setStory(game.getStory());//ストーリー
		bean.setImageUrl(game.getImageUrl());//画像

		return bean;
	}

	/**
	 * ゲームレビュー詳細表示
	 * @return
	 */
	public List<GameDataBean> getReview(int gameId) {

		List<GameReview> reviewList = reviewRepository.findById(gameId);

		List<GameDataBean> gameDataBean = new ArrayList<GameDataBean>();

		for (GameReview list : reviewList) {
			GameDataBean bean = new GameDataBean();
			bean.setGameId(list.getGameId());//ゲームID
			bean.setReviewTitle(list.getReviewTitle());//タイトル
			bean.setReview(list.getReview());//レビュー
			bean.setEvaluation(list.getEvaluation());//評価


			gameDataBean.add(bean);
		}
		return gameDataBean;
	}

	/**
	 * ゲームレビュー詳細表示
	 * @return
	 */
	public List<GameDataBean> getCaracter(int gameId) {

		List<GameCaracter> caraList = caraRepository.findById(gameId);

		List<GameDataBean> gameDataBean = new ArrayList<GameDataBean>();

		for (GameCaracter list : caraList) {
			GameDataBean bean = new GameDataBean();
			bean.setGameId(list.getGameId());//ゲームID
			bean.setCaraName(list.getCaraName());//キャラクター名
			bean.setCaraOverview(list.getCaraOverview());//キャラクター概要
			bean.setAppearanceWork(list.getAppearanceWork());//評価

			gameDataBean.add(bean);
		}
		return gameDataBean;
	}

	/**
	 * ゲーム登録
	 * @param form
	 * @throws IOException
	 */
	public void update(GameForm form) throws IOException {


			GameWork game = new GameWork();

			game.setTitle(form.getTitle());
			game.setGameModel(form.getGameModel());//機種
			game.setRegisterId(1000);//登録者ID
			game.setReleaseDate(form.getReleaseDate());//発売日
			game.setSellingAgency(form.getSellingAgency());//発売元
			game.setStory(form.getStory());//入荷日
			game.setRegistrationDate(LocalDateTime.now());//登録日

			try {
				game.setImageUrl(Base64.encodeBase64String(form.getImage().getBytes()));//画像URL
			}catch (NullPointerException i) {
				game.setImageUrl(null);
			}


			demoRepository.save(game);
	}

}
