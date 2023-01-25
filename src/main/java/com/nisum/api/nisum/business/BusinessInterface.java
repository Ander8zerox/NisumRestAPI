package com.nisum.api.nisum.business;

import com.nisum.api.nisum.business.model.request.BUser;
import com.nisum.api.nisum.business.model.response.BDataResponse;

public interface BusinessInterface {

    BDataResponse createUser(BUser user);

}
