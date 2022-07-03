package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char initialValue = sc.next().charAt(0);

		if (initialValue == 'y') {
			System.out.println("Enter initial deposit value: ");
			double valueDeposit = sc.nextDouble();
			account = new Account(number, holder, valueDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println("Account data: ");
		System.out.println("Account " + account.getNumber() + ", " + "Holder: " + account.getHolder() + ", " + "$ "
				+ account.getBalance());

		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		sc.nextLine();
		System.out.println("Updated account data: ");
		System.out.println("Account " + account.getNumber() + ", " + "Holder: " + account.getHolder() + ", "
				+ account.getBalance());
		sc.nextLine();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		sc.nextLine();
		System.out.println("Updated account data: ");
		System.out.println("Account " + account.getNumber() + ", " + "Holder: " + account.getHolder() + ", "
				+ account.getBalance());

		sc.close();
	}
}
