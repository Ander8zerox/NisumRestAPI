package com.nisum.api.nisum.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.api.nisum.controller.model.request.User;

import java.io.IOException;
import java.nio.file.Paths;

public class DummyMock {

    public static User getRequest(String path){

        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User();
        try {
            user = objectMapper.readValue(Paths.get(path).toFile(), User.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
