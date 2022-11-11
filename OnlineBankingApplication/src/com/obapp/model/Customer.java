package com.obapp.model;

import java.sql.Date;

public class Customer {
	
	private String name;
	private String city;
	private String mobile_no;
	private String email;
	private Date dob;
	private int acnumber;
	private int pin;
	private int balance;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String city, String mobile_no, String email, Date dob, int acnumber, int pin,
			int balance) {
		super();
		this.name = name;
		this.city = city;
		this.mobile_no = mobile_no;
		this.email = email;
		this.dob = dob;
		this.acnumber = acnumber;
		this.pin = pin;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAcnumber() {
		return acnumber;
	}

	public void setAcnumber(int acnumber) {
		this.acnumber = acnumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", mobile_no=" + mobile_no + ", email=" + email + ", dob="
				+ dob + ", acnumber=" + acnumber + ", pin=" + pin + ", balance=" + balance + "]";
	}
	
}
