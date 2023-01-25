package com.nisum.api.nisum.business.mapper;

import com.nisum.api.nisum.business.model.response.BDataContent;
import com.nisum.api.nisum.business.repository.model.UserDAO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessMapper {
    @Mapping(source = "bDataContent.user.id", target = "userId")
    @Mapping(source = "bDataContent.user.name", target = "name")
    @Mapping(source = "bDataContent.user.email", target = "email")
    @Mapping(source = "bDataContent.user.password", target = "password")
    @Mapping(source = "bDataContent.user.phones", target = "phones")
    @Mapping(source = "created", target = "created")
    @Mapping(source = "modified", target = "modified")
    @Mapping(source = "lastLogin", target = "lastLogin")
    @Mapping(source = "token", target = "token")
    @Mapping(source = "isActive", target = "isActive")
    UserDAO BDataContentToUserDAO(BDataContent bDataContent);
}
