package com.Exp;

public class Bankexp 
{
            public static void main(String[]args)
            {
            	int accounts[]= {101,102,103,104,105};
            	String names[]= {"tom","mom","dad","sis","ram"};
            	double balance[]= {4000,900,7000,9000,5000};
            			for(int i=0;i<accounts.length;i++) {
            				System.out.println(accounts[i] +" "+names[i]+" "+balance[i]);
            				if(balance[i]<1000)
            				{
            					try
            					{
            						throw new LowBalanceException();
            					}
            					catch(LowBalanceException e)
            					{
            						System.err.println(names[i]+" your balance is low please deposit some amount");
            					}
            				}
            			}
            	}
            }

