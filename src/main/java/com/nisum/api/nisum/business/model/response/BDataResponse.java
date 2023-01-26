package com.nisum.api.nisum.business.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BDataResponse {

    private String message;
    private BDataContent content;
}
