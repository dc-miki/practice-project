package com.example.demo.form;

import java.time.LocalDateTime;

import com.sun.istack.NotNull;

import lombok.Data;

/**
 * ユーザー登録用フォーム
 * @author dc_miki
 *
 */
@Data
public class UserForm {

	/**ユーザーID */
    Integer userId;

    /** ユーザー名 */
    @NotNull
    String userName;

    /** パスワード */
    @NotNull
    String password;

    /** E-mailアドレス */
    String eMail;

    /** ユーザー種別 */
    Integer master;

    /** 登録日 */
    LocalDateTime registrationDate;

}
