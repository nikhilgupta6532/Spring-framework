package com.nikhilgupta.springframework;

import com.nikhilgupta.springframework.controllers.ConstructorInjectedController;
import com.nikhilgupta.springframework.controllers.MyController;
import com.nikhilgupta.springframework.controllers.PropertyInjectedController;
import com.nikhilgupta.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
