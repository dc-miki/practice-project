package com.example.demo.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * ゲーム一覧表示用Bean
 * @author dc_miki
 *
 */
@Data
public class GameViewBean {

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


}
