package Bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account holder name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account number : ");
		String Acno = sc.nextLine();
		
		BankAccount BankApp = new SavingsAccount(name, Acno, 0);
		
		int choice;
		do {
			System.out.println("BANK MENU");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. View info");
			System.out.println("4. Account type");
			System.out.println("5. Exit");
			System.out.println("Select the option above : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the Amount to deposit : ");
				double dep = sc.nextDouble();
				BankApp.deposit(dep);
				break;
				
			case 2:
				System.out.println("Enter the Withdraw Amount : ");
				double with = sc.nextDouble();
				BankApp.withdraw(with);
				break;
				
			case 3:
				BankApp.displayinfo();
				break;
				
			case 4:
				BankApp.AccountType();
				break;
				
			case 5:
				System.out.println("Exiting, Thank you for using Banking App");
				break;
				
				default :
					System.out.println("Invalid option, Try Again");
				
			}
		
		
	}while(choice!=5);
		
   sc.close();
}
	
}
