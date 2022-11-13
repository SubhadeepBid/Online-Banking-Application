package com.obapp.usecases;

import java.util.List;

import com.obapp.dao.AccountantDao;
import com.obapp.dao.AccountantDaoImpl;
import com.obapp.exceptions.AccountantException;
import com.obapp.model.Customer;

public class ShowAllCustomers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		AccountantDao dao = new AccountantDaoImpl();
		
		try {
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-20s%-16s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Name", "City", "Mobile No.", "Email", "D.O.B.", "A/c. No.", "PIN", "Balance");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			
			List<Customer> list = dao.showAllCustomers();
			list.forEach(i -> {
				
				System.out.printf("%-20s%-16s%-20s%-20s%-20s%-20d%-20d%-20d\n", i.getName(), i.getCity(), i.getMobile_no(), i.getEmail(), i.getDob(), i.getAcnumber(), i.getPin(), i.getBalance());
				
			});
			
		} catch (AccountantException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}

}
