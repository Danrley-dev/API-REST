package com.example.TesteUnitario.services;

import java.util.List;

import com.example.TesteUnitario.domain.User;

public interface UserService {
	
	User findById(Integer id);

	List<User> findAll();	
}
