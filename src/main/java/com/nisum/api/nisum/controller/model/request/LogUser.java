package com.nisum.api.nisum.controller.model.request;

import com.nisum.api.nisum.util.Constants;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class LogUser {

    @NotBlank(message = "name may not be blank")
    private String name;

    @Email(regexp = Constants.EMAIL_REGEX,flags = Pattern.Flag.CASE_INSENSITIVE)
    @NotBlank(message = "email may not be blank")
    private String email;

    @Pattern(regexp = Constants.PASSWORD_REGEX, message = "password must contain at least one number")
    @NotBlank(message = "password may not be blank")
    private String password;
}
