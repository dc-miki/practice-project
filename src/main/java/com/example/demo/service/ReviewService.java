package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.GameReview;
import com.example.demo.form.ReviewForm;
import com.example.demo.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewService {

	//GameReviewのリポジトリ
	private final ReviewRepository reviewRepository;

	/**
	 * レビュー登録
	 * @param form
	 */
	public void update(ReviewForm form) {


			GameReview review = new GameReview();

			review.setReviewTitle(form.getReviewTitle());//キャラ名
			review.setReview(form.getReview());//あらすじ
			review.setEvaluation(form.getEvaluation());//ゲームID
			review.setGameId(form.getGameId());//登場作品

			reviewRepository.save(review);
	}

}
