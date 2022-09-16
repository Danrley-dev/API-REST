package com.example.TesteUnitario.services.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TesteUnitario.Repositories.UserRepository;
import com.example.TesteUnitario.domain.User;
import com.example.TesteUnitario.domain.dto.UserDTO;
import com.example.TesteUnitario.services.UserService;
import com.example.TesteUnitario.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}

	@Override
	public User create(UserDTO obj) {
		return repository.save(mapper.map(obj, User.class));
	}

}
