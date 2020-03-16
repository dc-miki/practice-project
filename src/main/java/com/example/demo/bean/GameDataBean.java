package com.example.demo.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * ゲーム作品概要表示用Bean
 * @author dc_miki
 *
 */
@Data
public class GameDataBean {

	/** ゲームID */
    Integer gameId;

    /** 画像URL */
    String imageUrl;

    /** ゲームタイトル */
    String title;

    /** ストーリー */
    String story;

    /** 発売日 */
    LocalDate releaseDate;

    /** 発売元 */
    String sellingAgency;

    /** 機種 */
    String gameModel;

    /** 登録日時 */
    LocalDateTime registrationDate;

    /**登録者ID */
    Integer registerId;

    /**レビューID */
    Integer reviewId;

    /** レビュータイトル */
    String reviewTitle;

    /** レビュー内容 */
    String review;

    /** 評価 */
    Integer evaluation;


	/** ゲームキャラクターID */
    Integer caraId;

    /** キャラクター名 */
    String caraName;

    /** キャラクター概要 */
    String caraOverview;


    /** 画像 */
    String caraImageUrl;


    /** 登録作品 */
    String appearanceWork;



}
