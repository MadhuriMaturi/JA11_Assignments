package com.hexaware.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.Aop.config.AppConfig;
import com.hexaware.Aop.service.Bankservice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Bankservice service = context.getBean(Bankservice.class);    	
    	
    			service.fundTransfer();
    			
    			//service.login();
    	
    			service.withdraw();
    			
    			//service.deposit();
    	
    		double balance =	service.getBalance(101);  
    		System.out.println("Balance  "+balance);
    	
    }
}
