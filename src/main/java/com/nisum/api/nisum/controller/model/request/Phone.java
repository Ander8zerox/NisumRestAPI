package com.nisum.api.nisum.controller.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
public class Phone implements Serializable {
    @NotBlank(message = "number may not be blank")
    private String number;
    @NotBlank(message = "cityCode may not be blank")
    private String cityCode;
    @NotBlank(message = "countryCode may not be blank")
    private String countryCode;
}
