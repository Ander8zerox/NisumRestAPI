package com.nisum.api.nisum.controller;

import com.nisum.api.nisum.business.BusinessInterface;
import com.nisum.api.nisum.controller.mapper.ControllerMapper;
import com.nisum.api.nisum.util.Constants;
import com.nisum.api.nisum.util.DummyMock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void shouldCreateUser() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                        .post("/userCreation")
                        .content(DummyMock.asJsonString(DummyMock.getRequest(Constants.REQUEST_COMPLETE_FILE_PATH)))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
    }

}