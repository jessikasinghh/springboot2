package com.example.springboot2;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public String getMessage() {
        return "Hello from DemoBean!";
    }
}