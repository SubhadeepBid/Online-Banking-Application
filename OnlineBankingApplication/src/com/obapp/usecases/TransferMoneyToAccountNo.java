package com.obapp.usecases;

import java.util.Scanner;

import com.obapp.dao.CustomerDao;
import com.obapp.dao.CustomerDaoImpl;
import com.obapp.exceptions.CustomerException;

public class TransferMoneyToAccountNo {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your A/c no. : ");
		int sender = sc.nextInt();
		
		System.out.println("Enter the Recipient A/c no. : ");
		int receiver = sc.nextInt();
		
		System.out.println("Enter the amount : ");
		int money = sc.nextInt();
		
		CustomerDao dao = new CustomerDaoImpl();
		
		try {
			
			String result = dao.transferMoneyToAccountNo(sender, receiver, money);
			System.out.println(result);
			
		} catch (CustomerException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
	}

}
