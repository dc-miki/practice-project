package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*ゲーム作品DBのEntity
*/
@Entity
@Table(name = "game_work")
public class GameWork {

	/** ゲームID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    Integer gameId;

    /** 画像URL */
    @Column(name = "image_url")
    String imageUrl;

    /** ゲームタイトル */
    @Column(name = "title")
    String title;

    /** ストーリー */
    @Column(name = "story")
    String story;


    /** 発売日 */
    @Column(name = "release_date")
    LocalDate releaseDate;

    /** 発売元 */
    @Column(name = "selling_agency")
    String sellingAgency;

    /** 機種 */
    @Column(name = "game_model")
    String gameModel;

    /** 登録日時 */
    @Column(name = "registration_date")
    LocalDateTime registrationDate;

    /**登録者ID */
    @Column(name = "register_id")
    Integer registerId;


    /**
     * Returns the gameId.
     *
     * @return the gameId
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * Sets the gameId.
     *
     * @param bookId the gameId
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * Returns the image_url.
     *
     * @return the image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the imageUrl.
     *
     * @param bookId the imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Returns the title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param bookId the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the title.
     *
     * @return the title
     */
    public String getStory() {
        return story;
    }

    /**
     * Sets the title.
     *
     * @param bookId the title
     */
    public void setStory(String story) {
        this.story = story;
    }

    /**
     * Returns the releaseDate.
     *
     * @return the releaseDate
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the releaseDate.
     *
     * @param  the releaseDate
     */
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Returns the sellingAgency.
     *
     * @return the sellingAgency
     */
    public String getSellingAgency() {
        return sellingAgency;
    }

    /**
     * Sets the sellingAgency.
     *
     * @param bookId the sellingAgency
     */
    public void setSellingAgency(String sellingAgency) {
        this.sellingAgency = sellingAgency;
    }

    /**
     * Returns the gameModel.
     *
     * @return the gameModel
     */
    public String getGameModel() {
        return gameModel;
    }

    /**
     * Sets the sellingAgency.
     *
     * @param bookId the sellingAgency
     */
    public void setGameModel(String gameModel) {
        this.gameModel = gameModel;
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
     * Sets the registrationDate.
     *
     * @param  the registrationDate
     */
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * Returns the registerId.
     *
     * @return the registerId
     */
    public Integer getRegisterId() {
        return registerId;
    }

    /**
     * Sets the registerId.
     *
     * @param bookId the registerId
     */
    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }




}
