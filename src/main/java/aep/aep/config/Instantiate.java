package aep.aep.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import aep.aep.entities.User;
import aep.aep.repository.UserRepository;

@Configuration
public class Instantiate implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "João", "joaocurti@gmail.com", "teste");
		User user2 = new User(null, "Eduardo", "eduardo@gmail.com", "testee");
		User user3 = new User(null, "Gianluca", "gian@gmail.com", "testeeee");
		
		userRepository.saveAll(Arrays.asList(user1,user2,user3));
		
	}

}
