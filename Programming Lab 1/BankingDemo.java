import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Press D to deposite or w to withdraw.");
		char choice = scanner.nextLine().charAt(0);
		
		 if (choice == 'd' || choice == 'D')
         {
         
         }
		 else if (choice == 'w' || choice == 'W')
		 {
			 System.out.println("What is your balance");
			 double balance = scanner.nextDouble();
			 SavingsAccount saveA = new SavingsAccount(balance); 
			 
			 System.out.println(saveA);
			 
		 }
		 else
		 {
			 System.out.println("Incorrect choice");
		 }
		 
	}

}
