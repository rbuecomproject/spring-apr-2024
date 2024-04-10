package com.rbu.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC{
		public static void main(String args[])
		{
			
		//IOC container
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
			
		//for all below req only one object created as Singleton
		HelloWorld h1=(HelloWorld)ap.getBean("hw");
		HelloWorld h2=(HelloWorld)ap.getBean("hw");
		HelloWorld h3=(HelloWorld)ap.getBean("hw");
		HelloWorld h4=(HelloWorld)ap.getBean("hw");
		HelloWorld h5=(HelloWorld)ap.getBean("hw");
		HelloWorld h6=(HelloWorld)ap.getBean("hw");
		HelloWorld h7=(HelloWorld)ap.getBean("hw");
		HelloWorld h8=(HelloWorld)ap.getBean("hw");
		HelloWorld h9=(HelloWorld)ap.getBean("hw");
		HelloWorld h10=(HelloWorld)ap.getBean("hw");
		
		System.out.println( h1==h2);
		System.out.println( h1==h3);
		System.out.println( h1==h4);
		System.out.println( h1==h5);
		System.out.println( h1==h6);
		System.out.println( h1==h7);
		System.out.println( h1==h8);
		System.out.println( h1==h9);
		System.out.println( h1==h10);		
		
		
		
		
		
		
		
		}
	
	
	}
	