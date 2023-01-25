package com.nisum.api.nisum.business.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BUser {

    private String id;
    private String name;
    private String email;
    private String password;
    private List<BPhone> phones;
}
