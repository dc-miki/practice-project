package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * ユーザーDBのEntity
*/
@Entity
@Table(name = "user")
public class User implements UserDetails{

	  private static final long serialVersionUID = 1L;
	  public enum Authority {ROLE_USER, ROLE_ADMIN};

	/**ユーザーID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Integer userId;

    /** ユーザー名 */
    @Column(name = "user_name")
    String username;

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
    public void setUserName(String username) {
        this.username = username;
    }

    /**
     * Returns the userName.
     *
     * @return the userName
     */
    public String getUserName() {
        return username;
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

    //これがなにやってるのかわかんない
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      List<GrantedAuthority> authorities = new ArrayList<>();
      authorities.add(new SimpleGrantedAuthority(authorities.toString()));
      return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
      return true;
    }

    @Override
    public boolean isAccountNonLocked() {
      return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
      return true;
    }

    @Override
    public boolean isEnabled() {
      return true;
    }

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
