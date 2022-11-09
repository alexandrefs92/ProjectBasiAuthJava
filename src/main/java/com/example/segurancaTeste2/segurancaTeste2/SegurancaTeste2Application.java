package com.example.segurancaTeste2.segurancaTeste2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SegurancaTeste2Application {

	public static void main(String[] args) {
		SpringApplication.run(SegurancaTeste2Application.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}

}
