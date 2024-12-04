package com.karbarose.bank;

import java.util.Scanner;

public class BankApp {

	public void showMainMenu() {

		while (true) {
			System.out.println("Welcom to kyaBank");
			System.out.println("Choose your menu");
			System.out.println("1 . Login");
			System.out.println("2 . Create Account");
			System.out.println("3 . Exit");
			System.out.println("Enter your choice");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Login page");
				break;
			case 2:
				System.out.println("Acoount creation");
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
