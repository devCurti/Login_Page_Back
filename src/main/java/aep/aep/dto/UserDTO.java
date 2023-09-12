package aep.aep.dto;

import aep.aep.entities.User;

public record UserDTO(Long id, String name, String email, String password) {
	public UserDTO(User user) {
		this(user.getId(), user.getName(), user.getEmail(), user.getPassword());
	}
}
