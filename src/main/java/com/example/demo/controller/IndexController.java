package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.UserForm;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IndexController {

	@Autowired
	private final UserService userService;

	/**
	 * ログイン前画面表示
	 * @return
	 */
    @RequestMapping("/")
    public String index() {

        return "redirect:/top";
    }

    /**
     * ログイン画面表示
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
    	model.addAttribute("iserror",false);
	    return "error/login";

    }

    /**
     * ログインエラー画面表示
     * @param model
     * @return
     */
    @RequestMapping(value = "/login-error", method = RequestMethod.GET)
	public String loginError(Model model) {
		 model.addAttribute("iserror",true);
		 return "error/login";
	}

    /**
     * 新規ユーザー登録画面表示
     * @param model
     * @return
     */
    @RequestMapping(value = "/user-regist", method = RequestMethod.GET)
    public String userRegist(Model model) {

    	UserForm userForm = new UserForm();
    	model.addAttribute("userForm",userForm);

	    return "error/user_regist";

    }

    /**
	 * ユーザー新規登録処理命令
	 *
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/Register", method = RequestMethod.POST)
	public String newData(@Validated UserForm userForm, BindingResult result, Model model) throws IOException {

		if (result.hasErrors()) {
			return "error/user_regist";
		}

		userService.register(userForm);
		return "error/regist_done";

	}


}
