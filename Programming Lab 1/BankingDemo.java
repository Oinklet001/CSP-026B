import java.util.Scanner;

public class BankingDemo {



	public static void main(String[] args) 
	{
   
   Scanner scanner = new Scanner(System.in);
   
   	  System.out.println("What is the current balance?");
	     double balance = scanner.nextDouble();
	     
	     System.out.println("How many withdrawls a month?");
	     double withdrawsAMonth = scanner.nextDouble();
   
   SavingAccount saveA = new SavingAccount(balance, withdrawsAMonth);
   }
}
