package com.nisum.api.nisum.business.repository;

import com.nisum.api.nisum.business.repository.model.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryInterface extends JpaRepository<UserDAO, String> {

    UserDAO save(UserDAO userDAO);
}
