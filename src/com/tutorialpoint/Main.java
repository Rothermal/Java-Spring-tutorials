package com.tutorialpoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String [] args){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//	this is just the basic hello world.	
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld"); 
//		obj.getMessage();

// this is hello world with singleton scope - note code is the same for prototype
// for singleton - this will create the message, i am object a for both entries
// for prototype it will print the i am object a for a and the default message 
// set in the bean for obj b.
// there are also request, session, global session scopes, 
// request scope - scopes a bean to an http request
// session scope - scopes  bean to an http session
// global session - scopes a bean to a global http session		
		
//		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//		
//		objA.setMessage("I am Object A");
//		objA.getMessage();
//		
//		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//		objB.getMessage();
		
		
// hello world spring bean life cycle
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
		
	} 
}
