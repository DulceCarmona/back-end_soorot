package com.soorot.application;

import com.soorot.application.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SoorotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoorotApplication.class, args);
	}//metodo main
	
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean =
				new FilterRegistrationBean<JwtFilter>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/soorot/productos/*");
		registrationBean.addUrlPatterns("/soorot/usuarios/*");
		return registrationBean;
	}//jwtFilter
}//EcommerceApplication 

