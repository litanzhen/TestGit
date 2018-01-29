package com.litanzhen.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String testService(String name){
        return "my name is: " + name;
    }
}
