package com.nisum.api.nisum.controller.model.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class DataResponse implements Serializable {

    private String message;
    private DataContent content;
}
