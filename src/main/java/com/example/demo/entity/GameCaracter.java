package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 登場キャラクターDBのEntity
*/
@Entity
@Table(name = "game_caracter")
public class GameCaracter {

	/** ゲームキャラクターID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cara_id")
    Integer caraId;

    /** キャラクター名 */
    @Column(name = "cara_name")
    String caraName;

    /** キャラクター概要 */
    @Column(name = "cara_overview")
    String caraOverview;


    /** 画像 */
    @Column(name = "cara_image_url")
    String caraImageUrl;


    /** 登録日時 */
    @Column(name = "registration_date")
    LocalDateTime registrationDate;

    /** 登場作品 */
    @Column(name = "appearance_work")
    String appearanceWork;

    /**ゲームID */
    @Column(name = "game_id")
    Integer gameId;

    /**
     * Sets the caraId.
     *
     * @param  the caraId
     */
    public void setCaraId(Integer caraId) {
        this.caraId = caraId;
    }

    /**
     * Returns the caraId.
     *
     * @return the caraId
     */
    public Integer getCaraId() {
        return caraId;
    }

    /**
     * Sets the caraName.
     *
     * @param  the caraName
     */
    public void setCaraName(String caraName) {
        this.caraName = caraName;
    }

    /**
     * Returns the caraName.
     *
     * @return the caraName
     */
    public String getCaraName() {
        return caraName;
    }

    /**
     * Sets the caraOverview.
     *
     * @param  the caraOverview
     */
    public void setCaraOverview(String caraOverview) {
        this.caraOverview = caraOverview;
    }

    /**
     * Returns the caraOverview.
     *
     * @return the caraOverview
     */
    public String getCaraOverview() {
        return caraOverview;
    }

    /**
     * Sets the caraImageUrl.
     *
     * @param  the caraImageUrl
     */
    public void setCaraImageUrl(String caraImageUrl) {
        this.caraImageUrl = caraImageUrl;
    }

    /**
     * Returns the caraImageUrl.
     *
     * @return the caraImageUrl
     */
    public String getCaraImageUrl() {
        return caraImageUrl;
    }

    /**
     * Sets the registrationDate.
     *
     * @param  the registrationDate
     */
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * Returns the registrationDate.
     *
     * @return the registrationDate
     */
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the appearanceWork.
     *
     * @param  the appearanceWork
     */
    public void setAppearanceWork(String appearanceWork) {
        this.appearanceWork = appearanceWork;
    }

    /**
     * Returns the appearanceWork.
     *
     * @return the appearanceWork
     */
    public String getAppearanceWork() {
        return appearanceWork;
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

}
