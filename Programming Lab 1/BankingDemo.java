import java.util.Scanner;

public class BankDemo {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		//Saving account object
		SavingsAccount saveA = new SavingsAccount();

		//Scanner class
		scanner = new Scanner(System.in);
		

		//user enter an input in whether they want to withdraw or not.
		System.out.println("Press D to deposite or w to withdraw.");
		char choice = scanner.nextLine().charAt(0);
		
		//It grabs the user's input and determines what options they get.
		if (choice == 'd' || choice == 'D')
         {
			 System.out.println("What is your balance");//Asks user their current balance.
			 double balance = scanner.nextDouble();
			 
			 System.out.println("how much money are you withdrawing?");//Asks user how much they are withdrawing.
			 double amount = scanner.nextDouble();
			 
			 saveA.setBalance(balance);
			  
			 saveA.deposit(balance);
			 
			 System.out.println(saveA);
         }
		 else if (choice == 'w' || choice == 'W')
		 {
			 System.out.println("What is your balance");//Asks user their current balance.
			 double balance = scanner.nextDouble();
			 
			 System.out.println("how much money are you withdrawing?");//Asks user how much they are withdrawing.
			 double amount = scanner.nextDouble();
			 
			 saveA.setBalance(balance);
			  
			 saveA.withdraw(balance);
			 
			// saveA.setMoney(amount);
			  
			// saveA.setMoney(amount);
			 
			 System.out.println(saveA);
			 
		 }
		 else
		 {
			 System.out.println("Incorrect choice");
		 }
		 
	}

}
