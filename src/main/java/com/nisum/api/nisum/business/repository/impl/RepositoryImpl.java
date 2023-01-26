package com.nisum.api.nisum.business.repository.impl;

import com.nisum.api.nisum.business.repository.RepositoryInterface;
import com.nisum.api.nisum.business.repository.dao.UserRepository;
import com.nisum.api.nisum.business.repository.model.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryImpl implements RepositoryInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDAO save(UserDAO userDAO) {
        return userRepository.save(userDAO);
    }

    @Override
    public List<UserDAO> findAll() {
        return userRepository.findAll();
    }
}
