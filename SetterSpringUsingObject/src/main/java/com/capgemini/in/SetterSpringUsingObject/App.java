package com.capgemini.in.SetterSpringUsingObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	
    	
    	Employee em = ac.getBean("emp", Employee.class);
    	System.out.println(em);
    	
}
}
