package com.tns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}

