package com.nisum.api.nisum.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ErrorEnum {

    EMAIL_ALREADY_EXISTS("the e-mail is already registered"),
    EMAIL_INVALID_FORMAT("the email format is incorrect"),
    PASSWORD_INVALID_FORMAT("the password format is incorrect");

    @Getter
    private String value;

}
