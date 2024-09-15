package com.nisum.api.nisum.business;

import com.nisum.api.nisum.business.model.request.BUser;
import com.nisum.api.nisum.business.model.response.BDataContent;
import com.nisum.api.nisum.business.model.response.BDataResponse;
import com.nisum.api.nisum.controller.model.response.DataResponse;

import java.util.List;

public interface BusinessInterface {

    BDataResponse createUser(BUser user);
    List<BDataContent> listUsers();

}
