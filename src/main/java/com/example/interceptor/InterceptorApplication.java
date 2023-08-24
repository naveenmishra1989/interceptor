package com.example.interceptor;

import com.example.interceptor.config.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InterceptorApplication implements WebMvcConfigurer {

	@Autowired
	private RequestHandler requestHandler;

	@Override
	public void addInterceptors (InterceptorRegistry registry) {
		registry.addInterceptor(requestHandler);
	}

	public static void main(String[] args) {
		SpringApplication.run(InterceptorApplication.class, args);
	}

}
