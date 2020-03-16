package com.example.demo.form;

import java.time.LocalDateTime;

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
    String userName;

    /** ユーザー種別 */
    Integer master;

    /** 登録日 */
    LocalDateTime registrationDate;

}
