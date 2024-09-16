package com.nisum.api.nisum.business.repository;

import com.nisum.api.nisum.business.repository.model.UserDAO;
import com.nisum.api.nisum.controller.model.request.LogUser;

import java.util.List;

public interface RepositoryInterface {

    UserDAO save(UserDAO userDAO);
    List<UserDAO> findAll();
}
