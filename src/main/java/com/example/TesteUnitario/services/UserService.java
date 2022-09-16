package com.example.TesteUnitario.services;

import java.util.List;

import com.example.TesteUnitario.domain.User;
import com.example.TesteUnitario.domain.dto.UserDTO;

public interface UserService {
	
	User findById(Integer id);
	List<User> findAll();	
	User create(UserDTO obj);
	User update(UserDTO obj);
}
