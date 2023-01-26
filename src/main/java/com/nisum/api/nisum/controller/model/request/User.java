package com.nisum.api.nisum.controller.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class User implements Serializable {

    private String id;
    @NotBlank(message = "name may not be blank")
    private String name;
    @NotBlank(message = "email may not be blank")
    private String email;
    @NotBlank(message = "password may not be blank")
    private String password;
    @Valid
    @NotNull(message = "phones may not be blank")
    private List<Phone> phones;
}
