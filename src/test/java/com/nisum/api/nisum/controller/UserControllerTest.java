package com.nisum.api.nisum.controller;

import com.nisum.api.nisum.util.Constants;
import com.nisum.api.nisum.util.DummyMock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
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
                .andExpect(MockMvcResultMatchers.jsonPath("$.content.user.id").exists());
    }

    @Test
    void shouldFailWhenInvalidEmailFormat() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                        .post("/userCreation")
                        .content(DummyMock.asJsonString(DummyMock.getRequest(Constants.REQUEST_INVALID_MAIL_FILE_PATH)))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.messages").value("must be a well-formed email address"));
    }

    @Test
    void shouldFailWhenInvalidPasswordFormat() throws Exception {
        mvc.perform( MockMvcRequestBuilders
                        .post("/userCreation")
                        .content(DummyMock.asJsonString(DummyMock.getRequest(Constants.REQUEST_INVALID_PASSWORD_FILE_PATH)))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(MockMvcResultMatchers.jsonPath("$.messages").value("password must contain at least one number"));
    }

}