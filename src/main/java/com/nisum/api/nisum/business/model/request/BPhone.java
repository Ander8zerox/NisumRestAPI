package com.nisum.api.nisum.business.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BPhone {
    private String number;
    private String cityCode;
    private String countryCode;
}
