public class SavingsAccount extends BankAccount
{

	//no argument constructor
	public SavingsAccount(double balance)
	{


	}
	
public void withdraw(double total) 
{
  if(balance >= 25)
  {
    super.withdraw(total);
  
  System.out.println("You withdrew money." + balance );
  }
  else
  {
	  System.out.println("You are to low.");
  }
  
}

public void deposit(double total) 
{
 if(balance >= 25)
   super.deposit(total);
}

protected void monthlyProcess()
{
  if(withdraws > 4)
	  monthlySC++;
   else
	   System.out.println("You did not go over 4 withdrawls this month." );

}
}
