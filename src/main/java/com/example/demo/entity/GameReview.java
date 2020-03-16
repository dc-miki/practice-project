package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *ゲームレビューDBのEntity
*/
@Entity
@Table(name = "game_review")
public class GameReview {

	/**レビューID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    Integer reviewId;

    /** レビュータイトル */
    @Column(name = "review_title")
    String reviewTitle;

    /** レビュー内容 */
    @Column(name = "review")
    String review;

    /** 評価 */
    @Column(name = "evaluation")
    Integer evaluation;

    /**ゲームID */
    @Column(name = "game_id")
    Integer gameId;

    /**
     * Sets the reviewId.
     *
     * @param  the reviewId
     */
    public void setCaraId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * Returns the reviewId.
     *
     * @return the reviewId
     */
    public Integer getReviewId() {
        return reviewId;
    }

    /**
     * Sets the gameId.
     *
     * @param  the gameId
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * Returns the gameId.
     *
     * @return the gameId
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * Sets the reviewTitle.
     *
     * @param  the reviewTitle
     */
    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    /**
     * Returns the reviewTitle.
     *
     * @return the reviewTitle
     */
    public String getReviewTitle() {
        return reviewTitle;
    }

    /**
     * Sets the review.
     *
     * @param  the review
     */
    public void setReview(String review) {
        this.review = review;
    }

    /**
     * Returns the review.
     *
     * @return the review
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the evaluation.
     *
     * @param  the evaluation
     */
    public void setEvaluation(Integer evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * Returns the evaluation.
     *
     * @return the evaluation
     */
    public Integer getEvaluation() {
        return evaluation;
    }



}
