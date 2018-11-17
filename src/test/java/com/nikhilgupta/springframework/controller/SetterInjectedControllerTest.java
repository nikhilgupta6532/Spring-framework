package com.nikhilgupta.springframework.controller;

import com.nikhilgupta.springframework.controllers.SetterInjectedController;
import com.nikhilgupta.springframework.service.GreetingService;
import com.nikhilgupta.springframework.service.GreetingServiceImpl;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setup(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_NIKHIL, setterInjectedController.sayHello());
    }
}
