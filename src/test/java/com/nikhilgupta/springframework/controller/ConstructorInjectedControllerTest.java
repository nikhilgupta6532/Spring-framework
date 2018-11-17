package com.nikhilgupta.springframework.controller;

import com.nikhilgupta.springframework.controllers.ConstructorInjectedController;
import com.nikhilgupta.springframework.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_NIKHIL,constructorInjectedController.sayHello());
    }
}
