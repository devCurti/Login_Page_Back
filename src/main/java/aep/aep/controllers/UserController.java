package aep.aep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aep.aep.dto.UserDTO;
import aep.aep.entities.User;
import aep.aep.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	UserService userService;
	

	@GetMapping
	public ResponseEntity<List<UserDTO>> getAll(){
		List<UserDTO> users = userService.getAll().stream().map(UserDTO::new).toList();
		return ResponseEntity.ok().body(users);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UserDTO user){
		User newUser = userService.fromDTO(user);
		userService.insert(newUser);
		return ResponseEntity.ok().build();
	}
	
}
