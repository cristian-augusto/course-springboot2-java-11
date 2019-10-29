package com.cristianaugusto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianaugusto.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
