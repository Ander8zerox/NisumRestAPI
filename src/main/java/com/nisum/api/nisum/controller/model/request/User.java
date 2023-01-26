package com.nisum.api.nisum.controller.model.request;

import com.nisum.api.nisum.util.Constants;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class User implements Serializable {

    private String id;

    @NotBlank(message = "name may not be blank")
    private String name;

    @Email(regexp = Constants.EMAIL_REGEX,flags = Pattern.Flag.CASE_INSENSITIVE)
    @NotBlank(message = "email may not be blank")
    private String email;

    @Pattern(regexp = Constants.PASSWORD_REGEX, message = "password must contain at least one number")
    @NotBlank(message = "password may not be blank")
    private String password;

    @Valid
    @NotNull(message = "phones may not be null")
    private List<Phone> phones;
}
