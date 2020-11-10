package com.farani.administracaoccbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.farani.administracaoccbapi.config.property.AdmccbApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AdmccbApiProperty.class)
public class AdministracaoccbApiApplication {

	private static ApplicationContext APPLICATION_CONTEXT;

	public static void main(String[] args) {
		APPLICATION_CONTEXT = SpringApplication.run(AdministracaoccbApiApplication.class, args);
	}

	public static <T> T getBean(Class<T> type) {
		return APPLICATION_CONTEXT.getBean(type);
	}
}