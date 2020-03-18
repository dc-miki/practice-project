package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * ログイン後画面遷移
 * @author dc_miki
 *
 */
@Configuration
public class DemoWebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				/*    // AUTHORIZE
				    .authorizeRequests()
				     .mvcMatchers("/hello").permitAll()
				     .anyRequest()
				        .authenticated()
				    .and()
				    // LOGIN
				*/ .formLogin()
				/* */.defaultSuccessUrl("/after_top")
		// end
		;
	}


}
