package com.example.demo.bean;

import lombok.Data;

/**
 * ゲームレビュー表示用Bean
 * @author dc_miki
 *
 */
@Data
public class GameReviewBean {

	/**レビューID */
    Integer reviewId;

    /** レビュータイトル */
    String reviewTitle;

    /** レビュー内容 */
    String review;

    /** 評価 */
    Integer evaluation;

    /**ゲームID */
    Integer gameId;


}
