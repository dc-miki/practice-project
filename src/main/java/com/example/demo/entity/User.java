package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ユーザーDBのEntity
*/
@Entity
@Table(name = "user")
public class User {

	/**ユーザーID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Integer userId;

    /** ユーザー名 */
    @Column(name = "user_name")
    String userName;

    /** ユーザー種別 */
    @Column(name = "master")
    Integer master;

    /** 登録日 */
    @Column(name = "registration_date")
    LocalDateTime registrationDate;


    /**
     * Sets the userId.
     *
     * @param  the userId
     */
    public void setuserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Returns the userId.
     *
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the userName.
     *
     * @param  the userName
     */
    public void setuserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the userName.
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the master.
     *
     * @param  the master
     */
    public void setMaster(Integer master) {
        this.master = master;
    }

    /**
     * Returns the master.
     *
     * @return the master
     */
    public Integer getMaster() {
        return master;
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

}
