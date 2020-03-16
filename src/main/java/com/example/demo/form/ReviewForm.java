package com.example.demo.form;

import lombok.Data;

/**
 * ゲームレビュー登録用Bean
 * @author dc_miki
 *
 */
@Data
public class ReviewForm {

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
