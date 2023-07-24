package com.jwt.study.Jwt.Study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.Console;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JwtStudyApplication {

	public static void main(String[] args) throws  ExceptionInInitializerError{
		SpringApplication.run(JwtStudyApplication.class, args);
	}

}
