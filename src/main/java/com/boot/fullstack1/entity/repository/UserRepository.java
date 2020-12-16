package com.boot.fullstack1.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.fullstack1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


   User findByUsername(String username);

	
}
