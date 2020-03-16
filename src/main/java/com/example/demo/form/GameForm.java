package com.example.demo.form;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * ゲーム情報登録用フォーム
 * @author dc_miki
 *
 */
@Data
public class GameForm {

	/** ゲームID */
    Integer gameId;

    /** 画像URL */
    String imageUrl;

    /** ゲームタイトル */
    String title;

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

    /** 機種 */
    String story;



}
