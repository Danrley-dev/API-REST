package com.example.TesteUnitario.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.TesteUnitario.Repositories.UserRepository;
import com.example.TesteUnitario.domain.User;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private UserRepository repository;
	
	@Bean
	public void startDB() {
		User u1 = new User(null, "Danrley", "Danrley@gmail.com", "123");
		User u2 = new User(null, "Tawan", "tawan@gmail.com", "123");
		
		repository.saveAll(List.of(u1, u2));
	}
}
