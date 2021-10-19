package com.gaurav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.model.Person;

@SpringBootApplication
public class SpringbootscopeApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");
		Person p=(Person) ct.getBean("personSingleton");
		

	  
		SpringApplication.run(SpringbootscopeApplication.class, args);
	}
	
	
	
	
	
	

}
