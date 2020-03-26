package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * ログイン後画面遷移
 * @author dc_miki
 *
 */
@Configuration
public class DemoWebSecurityConfig extends WebSecurityConfigurerAdapter {


	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//フォーム認証を行う
		http.formLogin()
				//ログイン画面を表示するURLは/login
				.loginPage("/login")
				//認証成功時のデフォルト遷移先URは/
				.defaultSuccessUrl("/after_top")
				//認証失敗時の遷移先URLは/login-error
				//.failureUrl("/login-error")
				//userNameのパラメータをuserNameとする
				//.usernameParameter("userName")
				//passwordのパラメータをpasswordとおく
	            //.passwordParameter("password")
				//すべてのユーザに対して、ログインページへのアクセスを許す
				.permitAll();
		//すべてのユーザは認証されているユーザ以外にアクセスは許さない

		http.authorizeRequests()
				//認証不要なもの
				.antMatchers("/css/**", "/images/**", "/js/**", "/", "/login", "/top","/user-regist")
				//それ以外はすべて認証が必要
				.permitAll()
	            .antMatchers("/Register").permitAll()
	            .antMatchers("/Result").permitAll()
				.anyRequest()
				.authenticated();

		//ログアウト時の処理
		http.logout()
				.logoutUrl("/logout")//ログアウト時のURL（今回は未実装）
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.deleteCookies("SESSION", "JSESSIONID", "remember-me")

				.logoutSuccessUrl("/top");//ログアウト成功時のURL
	}

	@Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

	/*@Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
	      // ユーザ名'user', パスワード'user',ロール'USER'のユーザを追加
	      .withUser("user").password("user").roles("USER")
	      .and()
	      // ユーザ名'admin', パスワード'admin',ロール'ADMIN'のユーザを追加
	      .withUser("admin").password("admin").roles("ADMIN");
	  }
	*/
}
