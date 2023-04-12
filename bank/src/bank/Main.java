package bank;

import java.util.Scanner;

public class Main {

	static String q = "";
	static Scanner input = new Scanner(System.in);
	static Bank b;

	public static void main(String[] args) {
		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("Enter your account number");
		int accNum = input.nextInt();
		System.out.println("Enter your pin");
		int pin = input.nextInt();
		b = new Bank(name, accNum, pin);
		b.showDetails();

		input.nextLine();
		getUserQuery();

	}

	public static void getUserQuery() {
		System.out.println(" ");
		System.out.println("enter the following for further use");
		System.out.println("S : show balance");
		System.out.println("D : Deposit money");
		System.out.println("W : withdraw money");
		System.out.println("E : Exit bank");
		System.out.println(" ");
		String query = input.nextLine();
		q = query.toLowerCase();

		if (q.equals("d")) {
			b.depositMoney();
			getUserQuery();
		} else if (q.equals("w")) {
			b.withdrawMoney();
			getUserQuery();
		} else if (q.equals("s")) {
			b.checkBalance();
			getUserQuery();
		} else if (q.equals("e")) {
			System.out.println("exited bank");
		}else {
			System.out.println("error in respose please");
		}
	}
}
