package aep.aep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aep.aep.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
