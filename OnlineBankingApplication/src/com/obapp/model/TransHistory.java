package com.obapp.model;

import java.util.Date;

public class TransHistory {
	
	private int tnumber;
	private int acnumber;
	private Date dot;
	private int transaction_amount;
	private String transaction_type;
	
	public TransHistory() {
		// TODO Auto-generated constructor stub
	}

	public TransHistory(int tnumber, int acnumber, Date dot, int transaction_amount, String transaction_type) {
		super();
		this.tnumber = tnumber;
		this.acnumber = acnumber;
		this.dot = dot;
		this.transaction_amount = transaction_amount;
		this.transaction_type = transaction_type;
	}

	public int getTnumber() {
		return tnumber;
	}

	public void setTnumber(int tnumber) {
		this.tnumber = tnumber;
	}

	public int getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(int acnumber) {
		this.acnumber = acnumber;
	}

	public Date getDot() {
		return dot;
	}

	public void setDot(Date dot) {
		this.dot = dot;
	}

	public int getTransaction_amount() {
		return transaction_amount;
	}

	public void setTransaction_amount(int transaction_amount) {
		this.transaction_amount = transaction_amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	@Override
	public String toString() {
		return "TransHistory [tnumber=" + tnumber + ", acnumber=" + acnumber + ", dot=" + dot + ", transaction_amount="
				+ transaction_amount + ", transaction_type=" + transaction_type + "]";
	}

}
