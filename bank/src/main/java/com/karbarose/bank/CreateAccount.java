package com.karbarose.bank;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import com.karbarose.bank.Account.AccountType;

public class CreateAccount {

	public void createAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Personal Details ");
		System.out.println("Enter Name :");
		String name = scanner.next();
		System.out.println("Enter date of birth :");
		String dob = scanner.next();
		System.out.println("Enter Phone number :");
		int phnNumber = scanner.nextInt();
		System.out.println("Enter AAdhar number :");
		long adharCardNumber = scanner.nextLong();
		System.out.println("Enter Place :");
		String place = scanner.next();
		System.out.println("Enter UserName :");
		String userName = scanner.next();
		System.out.println("Enter password :");
		String password = scanner.next();

		// int accountNumber = scanner.nextInt();
		AccountType accountType;

		System.out.println("Choose Account type :");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Loan Account");
		int accountChoice = scanner.nextInt();
		switch (accountChoice) {
		case 1:
			accountType = AccountType.SAVINGS;
			break;
		case 2:
			accountType = AccountType.CURRENT;
			break;
		case 3:
			accountType = AccountType.LOAN;
			break;

		default:
			System.out.println("Selected wrong choice setting savings as default account");
			accountType = AccountType.SAVINGS;
			break;
		}

		System.out.println("Enter Deposit Ammount :");
		int balance = scanner.nextInt();
		
		Account acc = new Account();
		acc.setUserName(userName);
		acc.setPlace(place);
		acc.setPhnNumber(phnNumber);
		acc.setPassword(password);
		acc.setDob(dob);
		acc.setBalance(balance);
		acc.setAdharCardNumber(adharCardNumber);
		acc.setName(name);
		acc.setAccountNumber(Account.accountCount);
		acc.setAccountType(accountType);
		
		
	}
}
