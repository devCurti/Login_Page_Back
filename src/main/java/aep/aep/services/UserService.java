package aep.aep.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aep.aep.dto.UserDTO;
import aep.aep.entities.User;
import aep.aep.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.findAll();	
	}
	
	public void insert(User newUser) {			
		userRepository.save(newUser);
	}
	
	public User fromDTO(UserDTO userDTO) {
		User newUser = new User(userDTO.id(), userDTO.name(), userDTO.email(), userDTO.password());
		return newUser;
	}
	
	
	
}
