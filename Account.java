package com.guvi.task2;
import java.util.Scanner;

	public class Account {

		float balance=0;
		int depositamount,withdrawamount;
		Scanner sc=new Scanner(System.in);
		//constructor
		Account()
		{
			System.out.println("Account with 0 balance.....");
		}
		//parameterized constructor
		Account(int depositamount, int withdrawamount) {
			this.depositamount = depositamount;
			this.withdrawamount = withdrawamount;
		}
		//method to display the deposited amount
		void deposit()
		{
			System.out.println("Enter the amount to be deposited : ");
			depositamount=sc.nextInt();
			balance=balance+depositamount;
		}
		//method to display the withdraw amount
		void withdrawal()
		{
			System.out.println("Enter the withdrawal amount : ");
			withdrawamount=sc.nextInt();
			balance=balance-withdrawamount;
		}
		//method to display the balance
		void display()
		{
			System.out.println("Current balance is ...."+balance);
		}
		public static void main(String[] args) {
		Account acc=new Account();
		acc.deposit();
		acc.withdrawal();
		acc.display();
		}
	}

	/*
	
	Output:
	
	Account with 0 balance.....
	Enter the amount to be deposited : 
	500
	Enter the withdrawal amount : 
	250
	Current balance is ....250.0
	
	*/