package com.example.demo.service;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public interface UserDetails extends Serializable {
    String getUsername();
    String getPassword();
    boolean isAccountNonLocked();
    boolean isAccountNonExpired();
    boolean isCredentialNonExpired();
    Collection<? extends GrantedAuthority> getAuthorities();
}
