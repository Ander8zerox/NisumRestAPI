package com.nisum.api.nisum.controller.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class Phone implements Serializable {
    @NotEmpty
    private String number;
    @NotEmpty
    private String cityCode;
    @NotEmpty
    private String countryCode;
}
