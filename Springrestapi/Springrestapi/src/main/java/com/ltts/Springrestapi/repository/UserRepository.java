package com.ltts.Springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Springrestapi.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
