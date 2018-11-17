package com.nikhilgupta.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_NIKHIL = "Hello Nikhil";

    @Override
    public String sayGreeting() {
        return "Hello Nikhil";
    }
}
