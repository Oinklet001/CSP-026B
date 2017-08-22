public class SavingsAccount extends BankAccount
{


   public void withdraw(double total) 
   {
      if(balance >= 25)
      super.withdraw(total);
   }

   public void deposit(double total) 
   {
      if(balance >= 25)
      super.deposit(total);
   }

   //protect?
   public void monthlyProcess()
   {
    if(withdraws > 4)
	    monthlySC++;
    else
	   System.out.println("You did not go over 4 withdrawls this month." );

   }
}
