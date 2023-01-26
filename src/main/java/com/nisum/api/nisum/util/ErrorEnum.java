package com.nisum.api.nisum.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ErrorEnum {

    EMAIL_ALREADY_EXISTS("the e-mail is already registered");

    @Getter
    private String value;

}
