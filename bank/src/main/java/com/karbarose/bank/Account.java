package com.karbarose.bank;

public class Account {

	static int accountCount = 55;

	enum AccountType {
		SAVINGS, CURRENT, LOAN
	}

	private String name;
	private String dob;
	private int phnNumber;
	private long adharCardNumber;
	private String place;
	private String userName;
	private String password;
	private int accountNumber;
	private AccountType accountType; // savings,current,loan.
	private int balance;

	public Account() {
		accountCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(int phnNumber) {
		this.phnNumber = phnNumber;
	}

	public long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
