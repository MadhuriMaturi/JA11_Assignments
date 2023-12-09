package com.hexaware.Aop.service;

import org.springframework.stereotype.Service;
import org.aspectj.lang.annotation.Before;

@Service
public class Bankservice {
	
	
	
		public void login() {
			
			
			System.out.println("User Login success..");
			
		}
	
		
		public  void fundTransfer() {
			
			
			System.out.println("Fund Transfer successfully..");
			
			
		}
		
		public void withdraw() {
			
		
			
			System.out.println("Amount Withdraw successfully..");
			
		}
		
		public void deposit() {
	
			
			System.out.println("Amount Deposited successfully..");
			
		}
		
		public double  getBalance(int acno) {
			
				if(acno > 0) {
					
					return 99000;
				}
				else {
					
					throw new NullPointerException();
				}
			
		}
		
	
	

}
