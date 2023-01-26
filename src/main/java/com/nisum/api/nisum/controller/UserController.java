package com.nisum.api.nisum.controller;

import com.nisum.api.nisum.business.BusinessInterface;
import com.nisum.api.nisum.controller.mapper.ControllerMapper;
import com.nisum.api.nisum.controller.model.request.User;
import com.nisum.api.nisum.controller.model.response.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    BusinessInterface businessInterface;

    @Autowired
    ControllerMapper mapper;

    @GetMapping("/")
    public String checkHealth() {
        return "Nisum API works!";
    }

    @PostMapping("/userCreation")
    public ResponseEntity<DataResponse> createUser(@Valid @RequestBody User user){

        DataResponse dataResponse = mapper.BDataResponseToDataResponse(
                businessInterface
                        .createUser(mapper.userToBUser(user))
        );

        return new ResponseEntity<>(dataResponse,HttpStatus.CREATED);
    }
}
