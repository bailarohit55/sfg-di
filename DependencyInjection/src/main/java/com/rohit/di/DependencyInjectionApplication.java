package com.rohit.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rohit.di.controller.ConstructorInjectedController;
import com.rohit.di.controller.DIController;
import com.rohit.di.controller.I18nController;
import com.rohit.di.controller.PropertyInjectedController;
import com.rohit.di.controller.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		I18nController i18Controller = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18Controller.sayHello());
		
		DIController myController = (DIController) ctx.getBean("DIController");
		
		System.out.println(".....Primary Bean.....");
		
		System.out.println(myController.sayHello());
		
		System.out.println(".....Property.....");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println(".....Setter.....");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println(".....Constructor.....");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
	}

}
