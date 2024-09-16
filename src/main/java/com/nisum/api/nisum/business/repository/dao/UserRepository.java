package com.nisum.api.nisum.business.repository.dao;

import com.nisum.api.nisum.business.repository.model.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, String> {

    UserDAO save(UserDAO userDAO);
    List<UserDAO> findAll();
    UserDAO findByEmail(String email);
}
