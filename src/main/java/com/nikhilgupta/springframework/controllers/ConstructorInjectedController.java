package com.nikhilgupta.springframework.controllers;

import com.nikhilgupta.springframework.service.GreetingService;
import com.nikhilgupta.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

   public String sayHello(){
        return greetingService.sayGreeting();
    }
}
