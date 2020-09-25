package com.rab3tech.transaction.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rab3tech.transaction.dao.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	boolean existsByUsername(String username);

	User findByUsername(String username);

	@Transactional
	void deleteByUsername(String username);
}
