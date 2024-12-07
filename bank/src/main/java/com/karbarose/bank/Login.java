package com.karbarose.bank;

import java.util.Scanner;

public class Login {
	private int password;
	private String userName;

	public void showLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Login Details ");
		System.out.println("---------------------");
		System.out.println("Enter UserName :");
		String uName = scanner.next();
		System.out.println("Enter password :");
		int pswd = scanner.nextInt();
		System.out.println("\n Loading ........ ");


		// validating login
		validateLogin(pswd, uName);
	}

	public void validateLogin(int pswd, String uName) {
		if (pswd == 1234 && uName.equals("Arathi")) {
			System.out.println("valid password and UserName");
			password = pswd;
			userName = uName;
		} else {
			System.out.println("Invalid password and UserName");
		}

	}

}
