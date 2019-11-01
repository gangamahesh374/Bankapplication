package com.bankingapplication;
import java.util.Scanner;
public class BankingApplication {
	public static void main(String[] args)
	{
BankAccount ba= new BankAccount("Ganga mahesh","534367282");
	ba.showMenu();
		
	}

}
class BankAccount
{
	int balance;
	int previousTranscetion;
	String customerName;
	String customerId;
	BankAccount(String cname,String cid)
	{
		customerName=cname;
		customerId=cid;
	}
	void deposit(int amount){
		if(amount != 0)
		{
			balance = balance + amount;
			previousTranscetion=-amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance=balance-amount;
			previousTranscetion = -amount;
		}
	}
	void getPreviousTransction()
	{
		if(previousTranscetion > 0)
		{
		System.out.println("Deposited  :" +previousTranscetion);
		}
		else if(previousTranscetion < 0)
		{
			System.out.println("withdraw : "+(previousTranscetion));
		}
		else
		{
			System.out.println( " No transection occured");
		}
	}
	void showMenu()
	{
		char option ='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("Your id  "+customerId);
		System.out.println("\n");
		System.out.println("A.checkBalance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.previousTranscetion");
		System.out.println("E. Exit");
		 
		do
		{
			System.out.println("*************************************************************************************");
			System.out.println("Enter the option");
			System.out.println("*************************************************************************************");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			
			case 'A':
				System.out.println("**********************************************************************************");
				System.out.println("Balance = "+balance);
				System.out.println("***********************************************************************************");
				System.out.println("\n");
				break;
				
		
			case 'B':
				System.out.println("***********************************************************************************");
				System.out.println("Enter the deposit Amount");
				System.out.println("***********************************************************************************");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("***********************************************************************************");
				System.out.println("Enter an Withdraw Amount");
				System.out.println("***********************************************************************************");
				int amount2=sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("************************************************************************************");
				getPreviousTransction();
				System.out.println("*************************************************************************************");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("***************************************************************************************");
				break;
				
			default:
				System.out.println("Invalid option !! please enter again");
				break;
				
				
			}
		}
		while(option != 'E');
		{
			System.out.println("Thankyou for using our transection");
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}