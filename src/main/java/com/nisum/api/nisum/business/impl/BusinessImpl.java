package com.nisum.api.nisum.business.impl;

import com.nisum.api.nisum.business.BusinessInterface;
import com.nisum.api.nisum.business.mapper.BusinessMapper;
import com.nisum.api.nisum.business.model.request.BUser;
import com.nisum.api.nisum.business.model.response.BDataContent;
import com.nisum.api.nisum.business.model.response.BDataResponse;
import com.nisum.api.nisum.business.repository.RepositoryInterface;
import com.nisum.api.nisum.business.repository.model.UserDAO;
import com.nisum.api.nisum.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Service
public class BusinessImpl implements BusinessInterface {
    @Autowired
    BusinessMapper mapper;
    @Autowired
    RepositoryInterface repositoryInterface;
    @Override
    public BDataResponse createUser(BUser user) {

        user.setId(String.valueOf(UUID.randomUUID()));
        BDataContent bDataContent = BDataContent
                    .builder()
                    .user(user)
                    .created(String.valueOf(new Date()))
                    .modified(String.valueOf(new Date()))
                    .lastLogin(String.valueOf(new Date()))
                    .token(String.valueOf(UUID.randomUUID()))
                    .isActive(true)
                    .build();

        UserDAO userDAO = mapper.BDataContentToUserDAO(bDataContent);
        BDataContent bDataContentResponse = mapper.UserDAOToBDataContent(
                repositoryInterface.save(userDAO)
        );

        return BDataResponse
                .builder()
                .message(Constants.SUCCESS)
                .content(bDataContentResponse)
                .build();
    }

    @Override
    public List<BDataContent> listUsers() {

        List<BDataContent> bDataContentList = mapper.UserDAOListToBDataContentList(
                repositoryInterface.findAll()
        );

        return bDataContentList;
    }
}
