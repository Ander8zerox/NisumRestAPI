package com.nisum.api.nisum.controller;

import com.nisum.api.nisum.business.BusinessInterface;
import com.nisum.api.nisum.business.model.response.BDataContent;
import com.nisum.api.nisum.config.JwtUtil;
import com.nisum.api.nisum.controller.mapper.ControllerMapper;
import com.nisum.api.nisum.controller.model.request.LogUser;
import com.nisum.api.nisum.controller.model.request.User;
import com.nisum.api.nisum.controller.model.response.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    BusinessInterface businessInterface;

    @Autowired
    ControllerMapper mapper;
    private final AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;
    public UserController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;

    }

    @GetMapping("/")
    public String checkHealth() {
        return "Nisum API works!";
    }

    @PostMapping(path = "/user-creation", consumes = "application/json", produces = "application/json")
    public ResponseEntity<DataResponse> createUser(@Valid @RequestBody User user){

        DataResponse dataResponse = mapper.BDataResponseToDataResponse(
                businessInterface
                        .createUser(mapper.userToBUser(user))
        );
        return new ResponseEntity<>(dataResponse,HttpStatus.CREATED);
    }
    @GetMapping(path = "/users", produces = "application/json")
    public ResponseEntity<List<BDataContent>> listUsers(){

        List<BDataContent> bDataContentList = businessInterface
                .listUsers();
        return new ResponseEntity<>(bDataContentList,HttpStatus.OK);
    }


    @PostMapping(path ="/login", produces = "application/json")
    public ResponseEntity login(@RequestBody LogUser loginReq)  {

        try {
            Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginReq.getEmail(), loginReq.getPassword()));
            String token = jwtUtil.createToken(loginReq);
            return ResponseEntity.ok(token);

        }catch (BadCredentialsException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid username or password");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid username or password");
        }
    }
}

