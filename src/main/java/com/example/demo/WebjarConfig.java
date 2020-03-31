package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "webjars")
@Data
public class WebjarConfig {

	  private String bootstrap;
	  private String jquery;

}
