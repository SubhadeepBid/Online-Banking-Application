package com.obapp.dao;

import java.util.List;

import com.obapp.exceptions.CustomerException;
import com.obapp.model.TransHistory;

public interface CustomerDao {
	
	public int signInCustomer(String username, int pin) throws CustomerException;
	
	public String transferMoneyToAccountNo(int sender, int receiver, int money) throws CustomerException;
	
	public List<TransHistory> getTransactionHistory(int acnumber) throws CustomerException;
	
	public String depositAmount(int acnumber, int money) throws CustomerException;
	
	public String withdrawAmount(int acnumber, int money) throws CustomerException;
	
	public String changePin(int acnumber, int newPin) throws CustomerException;
	
	public String checkBalance(int acnumber) throws CustomerException;

}
