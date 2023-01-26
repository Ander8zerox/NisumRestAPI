package com.nisum.api.nisum.business.mapper;

import com.nisum.api.nisum.business.model.response.BDataContent;
import com.nisum.api.nisum.business.repository.model.UserDAO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessMapper {
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.name", target = "name")
    @Mapping(source = "user.email", target = "email")
    @Mapping(source = "user.password", target = "password")
    @Mapping(source = "user.phones", target = "phones")
    @Mapping(source = "created", target = "created")
    @Mapping(source = "modified", target = "modified")
    @Mapping(source = "lastLogin", target = "lastLogin")
    @Mapping(source = "token", target = "token")
    @Mapping(source = "isActive", target = "isActive")
    UserDAO BDataContentToUserDAO(BDataContent bDataContent);

    @Mapping(source = "userId", target = "user.id")
    @Mapping(source =  "name", target = "user.name")
    @Mapping(source = "email", target = "user.email")
    @Mapping(source = "password", target = "user.password")
    @Mapping(source = "phones", target = "user.phones")
    @Mapping(source = "created", target = "created")
    @Mapping(source = "modified", target = "modified")
    @Mapping(source = "lastLogin", target = "lastLogin")
    @Mapping(source = "token", target = "token")
    @Mapping(source = "isActive", target = "isActive")
    BDataContent UserDAOToBDataContent(UserDAO userDAO);
}
