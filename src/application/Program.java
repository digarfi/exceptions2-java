package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Account Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Account Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter the amount of withdraw: ");
		double amount= sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("New balance:  %.2f", account.getBalance());
		}
		
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	
	sc.close();
	}

}
