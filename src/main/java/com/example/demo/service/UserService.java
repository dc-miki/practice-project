package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.form.UserForm;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	//GameReviewのリポジトリ
	private final UserRepository userRepository;

	@Autowired
    PasswordEncoder passwordEncoder;

	/**
	 * ユーザー新規登録
	 * @param form
	 */
	public void register(UserForm userForm) {

		User user = new User();

		user.setUserName(userForm.getUserName());//名前
		user.setPassword(passwordEncoder.encode(userForm.getPassword()));//パスワード
		user.setMaster(2);//ユーザー種別:2(利用者)
		user.setEMail(userForm.getEMail());//メールアドレス
		user.setRegistrationDate(LocalDateTime.now());

		userRepository.save(user);

	}
}
