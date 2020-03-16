package com.example.demo.form;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * ゲームキャラクター表示用Bean
 * @author dc_miki
 *
 */
@Data
public class CaracterForm {

	/** ゲームキャラクターID */
    Integer caraId;

    /** キャラクター名 */
    String caraName;

    /** キャラクター概要 */
    String caraOverview;


    /** 画像 */
    String caraImageUrl;


    /** 登録日時 */
    LocalDateTime registrationDate;

    /** 登録作品 */
    String appearanceWork;

    /**ゲームID */
    Integer gameId;

}
