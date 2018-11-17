package com.nikhilgupta.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello- I am injected by constructor";
    }
}
