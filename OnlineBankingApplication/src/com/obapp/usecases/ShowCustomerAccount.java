package com.obapp.usecases;

import java.util.List;
import java.util.Scanner;

import com.obapp.dao.AccountantDao;
import com.obapp.dao.AccountantDaoImpl;
import com.obapp.dao.CustomerDao;
import com.obapp.dao.CustomerDaoImpl;
import com.obapp.exceptions.AccountantException;
import com.obapp.exceptions.CustomerException;
import com.obapp.model.Customer;
import com.obapp.model.TransHistory;

public class ShowCustomerAccount {
	
	public static void showCust() {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter A/c. No : ");
		
		int acnumber = sc.nextInt();
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			
			System.out.println("\n\nCustomer Details");
			Customer customer = dao.showCustomerAccount(acnumber);
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-20s%-16s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Name", "City", "Mobile No.", "Email", "D.O.B.", "A/c. No.", "PIN", "Balance");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf("%-20s%-16s%-20s%-20s%-20s%-20d%-20d%-20d\n", customer.getName(), customer.getCity(), customer.getMobile_no(), customer.getEmail(), customer.getDob(), customer.getAcnumber(), customer.getPin(), customer.getBalance());
			
		} catch (AccountantException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		CustomerDao dao1 = new CustomerDaoImpl();
		
		try {
			System.out.println("\n\nTransaction History");
			List<TransHistory> list = dao1.getTransactionHistory(acnumber);
			
			System.out.println("----------------------------------------------------------");
			System.out.printf("%-20s%-16s%6s%16s\n", "Transaction ID", "Date", "Amount", "Type");
			System.out.println("----------------------------------------------------------");
			
			list.forEach(s -> {
				
				System.out.printf("%-20d%-16s%6d%16s\n", s.getTnumber(), s.getDot(), s.getTransaction_amount(), s.getTransaction_type());
				
			});
			
		} catch (CustomerException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("\n================================================================================================================================================");
	
	}

	/*
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A/c. No : ");
		
		int acnumber = sc.nextInt();
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			
			System.out.println("\n\nCustomer Details");
			Customer customer = dao.showCustomerAccount(acnumber);
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-20s%-16s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Name", "City", "Mobile No.", "Email", "D.O.B.", "A/c. No.", "PIN", "Balance");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			
			System.out.printf("%-20s%-16s%-20s%-20s%-20s%-20d%-20d%-20d\n", customer.getName(), customer.getCity(), customer.getMobile_no(), customer.getEmail(), customer.getDob(), customer.getAcnumber(), customer.getPin(), customer.getBalance());
			
		} catch (AccountantException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		CustomerDao dao1 = new CustomerDaoImpl();
		
		try {
			System.out.println("\n\nTransaction History");
			List<TransHistory> list = dao1.getTransactionHistory(acnumber);
			
			System.out.println("----------------------------------------------------------");
			System.out.printf("%-20s%-16s%6s%16s\n", "Transaction ID", "Date", "Amount", "Type");
			System.out.println("----------------------------------------------------------");
			
			list.forEach(s -> {
				
				System.out.printf("%-20d%-16s%6d%16s\n", s.getTnumber(), s.getDot(), s.getTransaction_amount(), s.getTransaction_type());
				
			});
			
		} catch (CustomerException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	
	}
	*/

}
