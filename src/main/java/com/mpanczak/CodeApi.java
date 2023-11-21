package com.mpanczak;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code")
public class CodeApi {

    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("I'm a teapot", HttpStatusCode.valueOf(418));
//        return new ResponseEntity<>("Bad req", HttpStatus.BAD_REQUEST);
    }
}
