package com.obapp.usecases;

import java.util.Scanner;

import com.obapp.dao.CustomerDao;
import com.obapp.dao.CustomerDaoImpl;

public class SignInCustomer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String username = sc.next();
		
		System.out.println("Enter PIN : ");
		int pin = sc.nextInt();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			
			String result = dao.signInCustomer(username, pin);
			
			System.out.println(result);
			
		} catch (Exception e) {
			
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}

	}

}
