package com.nisum.api.nisum.controller.mapper;

import com.nisum.api.nisum.business.model.request.BUser;
import com.nisum.api.nisum.business.model.response.BDataResponse;
import com.nisum.api.nisum.controller.model.request.User;
import com.nisum.api.nisum.controller.model.response.DataResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ControllerMapper {

    BUser userToBUser(User user);
    DataResponse BDataResponseToDataResponse(BDataResponse bDataResponse);
}
