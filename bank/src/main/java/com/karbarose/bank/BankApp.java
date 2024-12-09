package com.karbarose.bank;

import java.util.Scanner;

public class BankApp {

	public void showMainMenu() {

		while (true) {
			System.out.println("Welcome to kyaBank");
			System.out.println("------------------");
			System.out.println("Choose your menu \n");
			System.out.println("1 . Login");
			System.out.println("2 . Create Account");
			System.out.println("3 . Exit");
			System.out.println("--------------------");
			System.out.println("Enter your choice : ");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Login login = new Login();
				login.showLogin();				
				break;
			case 2:
				CreateAccount account = new CreateAccount();
				account.createAccount();
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0); // 0 indicates normal termination
				break;
			default:
				System.out.println("Invalid choice.try again");
				break;
			}
		}
	}

}
