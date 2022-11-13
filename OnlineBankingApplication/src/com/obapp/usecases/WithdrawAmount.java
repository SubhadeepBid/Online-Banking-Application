package com.obapp.usecases;

import java.util.Scanner;

import com.obapp.dao.CustomerDao;
import com.obapp.dao.CustomerDaoImpl;
import com.obapp.exceptions.CustomerException;

public class WithdrawAmount {
	
	public static void withdrawAmt(int acnumber) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter amount : ");
		int money = sc.nextInt();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			
			String result = dao.withdrawAmount(acnumber, money);
			System.out.println(result);
			
		} catch (CustomerException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("\n=======================");
		
	}

	/*
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A/c. No. : ");
		int acnumber = sc.nextInt();
		
		System.out.println("Enter amount : ");
		int money = sc.nextInt();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			
			String result = dao.withdrawAmount(acnumber, money);
			System.out.println(result);
			
		} catch (CustomerException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}
	*/

}
