package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.entity.GameCaracter;
import com.example.demo.form.CaracterForm;
import com.example.demo.repository.CaraRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CaracterService {

	//GameCaraのリポジトリ
	private final CaraRepository caraRepository;

	/**
	 * キャラクター登録
	 * @param gameId
	 */
	public void update(CaracterForm form) {


		GameCaracter cara = new GameCaracter();

		cara.setCaraName(form.getCaraName());//キャラ名
		cara.setCaraOverview(form.getCaraOverview());//あらすじ
		cara.setGameId(form.getGameId());//ゲームID
		cara.setAppearanceWork(form.getAppearanceWork());//登場作品
		cara.setRegistrationDate(LocalDateTime.now());//登録日

		caraRepository.save(cara);
	}

}
