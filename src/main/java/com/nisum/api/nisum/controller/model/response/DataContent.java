package com.nisum.api.nisum.controller.model.response;

import com.nisum.api.nisum.controller.model.request.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class DataContent implements Serializable {
    private User user;
    private String created;
    private String modified;
    private String lastLogin;
    private String token;
    private boolean isActive;
}
