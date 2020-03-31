package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserInfoService implements UserDetailsService {


	  private final UserRepository userRepository;

	@Override
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    if (username == null || "".equals(username)) {
	      throw new UsernameNotFoundException("Username is empty");
	    }

	    User userInfo = userRepository.findByUsername(username);
	    if (userInfo == null) {
	      throw new UsernameNotFoundException("User not found for name: " + username);
	    }

	    return userInfo;
	  }

}
