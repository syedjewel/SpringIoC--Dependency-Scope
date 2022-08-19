package com.di.test;

import com.di.config.AppConfiguration;
import com.di.controller.CustomerController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationUI {

	public static void main(String[] args) {
		
		  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
	        CustomerController  customerController = applicationContext.getBean(CustomerController.class);
	       customerController.saveData("Customer Controller Data Save344");
		
		
	}

}
