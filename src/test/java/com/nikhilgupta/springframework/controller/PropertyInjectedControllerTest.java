package com.nikhilgupta.springframework.controller;

import com.nikhilgupta.springframework.controllers.PropertyInjectedController;
import com.nikhilgupta.springframework.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_NIKHIL , propertyInjectedController.sayHello());
    }
}
