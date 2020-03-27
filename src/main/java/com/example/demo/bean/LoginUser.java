package com.example.demo.bean;

import java.util.List;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ログインユーザー情報
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LoginUser extends User{

	    /** serialVersionUID */
	    private static final long serialVersionUID = 1L;

	    private Integer userId;

	    public LoginUser(Integer userId, String username, String password, List<String> roles) {
	        super(username, password, AuthorityUtils.createAuthorityList(roles.toArray(new String[0])));
	        this.userId = userId;
	    }

}
