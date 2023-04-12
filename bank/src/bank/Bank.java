package bank;

import java.util.Scanner;

public class Bank {
	String name;
	int accountNumber;
	int pin;
	double balance;

	Scanner input = new Scanner(System.in);

	public Bank(String name, int accountNumber, int pin) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public void showDetails() {
		System.out.println("Name : " + name);
		System.out.println("Acc. number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}

	public void showBalance() {
		System.out.println("Balance : " + balance);
	}

	public void depositMoney() {
		System.out.println("enter amount to deposit");
		double amount = input.nextDouble();

		boolean test = checkPin(amount);
		if (test == true) {
			balance += amount;
			System.out.println("amount added to your account");
			showBalance();
		} else {
			System.out.println("system Error");
			System.out.println("money refunded");
		}
	}

	public void withdrawMoney() {
		System.out.println("enter amount to withdraw");
		double amount = input.nextDouble();

		boolean test = checkPin(amount);
		if (test == true) {
			balance -= amount;
			System.out.println("amount withdraw from your account");
			showBalance();
		} else {
			System.out.println("system Error");
			System.out.println("withdraw unsuccessful");
		}
	}
	
	public void checkBalance() {
		boolean test = checkPin(0);
		if (test == true) {
			showBalance();
		} else {
			System.out.println("system Error");
			System.out.println("withdraw unsuccessful");
		}
	}

	public boolean checkPin(double depositAmount) {
		System.out.println("enter your pin");
		int enteredpin = input.nextInt();
		if (enteredpin == pin) {
			return true;
		} else {
			System.out.println("incorrect pin enter again");
			checkPin(depositAmount);
			return false;
		}
	}

}
