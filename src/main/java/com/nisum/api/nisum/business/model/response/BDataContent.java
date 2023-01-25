package com.nisum.api.nisum.business.model.response;

import com.nisum.api.nisum.business.model.request.BUser;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class BDataContent {

    private BUser user;
    private String created;
    private String modified;
    private String lastLogin;
    private String token;
    private Boolean isActive;
}
