package com.library.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
		
}
