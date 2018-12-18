package com.sukumarc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sukumarc.beans.UserBean;


@Configuration
@ComponentScan(basePackages = { "com.sukumarc" })
@EnableWebMvc
@Import(UserBean.class)
public class WebConfig {

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
