package com.him.cafe.himcafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    private CafeUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String rensponseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+rensponseMessage+"\"}", httpStatus);

    }
}
