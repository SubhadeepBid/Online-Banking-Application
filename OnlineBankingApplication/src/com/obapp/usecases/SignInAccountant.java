package com.obapp.usecases;

import java.util.Scanner;

import com.obapp.dao.AccountantDao;
import com.obapp.dao.AccountantDaoImpl;
import com.obapp.exceptions.AccountantException;

public class SignInAccountant {
	
	public static boolean signInAcct() {
		
		boolean res = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter username : ");
	    String username = sc.next();
				
		System.out.println("Enter password : ");
    	String password = sc.next();
		
        AccountantDao dao = new AccountantDaoImpl();
    	
    	try {
    		
			String result = dao.signInAccountant(username, password);
			System.out.println(result);
			
			if(result == "Signed In Successfully!")
				res = true;
			
		} catch (AccountantException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
    	System.out.println("\n=======================");
		return res;
		
	}
	
	/*
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter username : ");
	    String username = sc.next();
				
		System.out.println("Enter password : ");
    	String password = sc.next();
    	
    	AccountantDao dao = new AccountantDaoImpl();
    	
    	try {
    		
			String result = dao.signInAccountant(username, password);
			System.out.println(result);
			
		} catch (AccountantException e) {
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
	}
	*/

}
