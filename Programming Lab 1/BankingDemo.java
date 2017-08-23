import java.util.Scanner;

public class BankDemo {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);

		//user enter an input in whether they want to withdraw or not.
		System.out.println("Press D to deposite or w to withdraw.");
		char choice = scanner.nextLine().charAt(0);
		
		//It grabs the user's input and determines what options they get.
		if (choice == 'd' || choice == 'D')
         {
         
         }
		 else if (choice == 'w' || choice == 'W')
		 {
			 System.out.println("What is your balance");//Asks user their current balance.
			 double balance = scanner.nextDouble();
			 
			 SavingsAccount saveA = new SavingsAccount(balance); //communicates to the class SavingsAccount.
			 
			 saveA.withdraw(balance);
			 
			 System.out.println(saveA);
			 
		 }
		 else
		 {
			 System.out.println("Incorrect choice");
		 }
		 
	}

}
