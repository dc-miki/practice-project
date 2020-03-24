package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {

        return "redirect:/top";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
    	model.addAttribute("iserror",false);
	    return "error/login";

    }

    @RequestMapping(value = "/login-error", method = RequestMethod.GET)
	public String loginError(Model model) {
		 model.addAttribute("iserror",true);
		 return "error/login";
	}

    @RequestMapping(value = "/user_regist", method = RequestMethod.GET)
    public String userRegist(Model model) {

	    return "error/user_regist";

    }
}
