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

    /** パスワード */
    @Column(name = "password")
    String password;

    /** e-mail */
    @Column(name = "e_mail")
    String eMail;

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
    public void setUserName(String userName) {
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

    /**
     * Sets the password.
     *
     * @param  the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the eMail.
     *
     * @param  the eMail
     */
    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * Returns the eMail.
     *
     * @return the eMail
     */
    public String getEMail() {
        return eMail;
    }



}
