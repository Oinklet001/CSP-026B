public class SavingAccount extends BankAccount
{
	private double total;
	private double money;

	//Sets the balance
	public void setBalance(double total)
	{
		balance = total;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	//Determines how much they want to use for depositing or withdrawing
/**	public void setMoney(double money)
	{
		withdraws = money;
	}
	
	public double getMoney()
	{
		return withdraws;
	}**/
	
	
public void withdraw(double balance) 
{
  if(balance >= 25)
  {
    super.withdraw(total);
    
   // balance = balance - withdraws;
  
  System.out.println("You withdrew money." + balance );
  }
  else
  {
	  System.out.println("You are to low.");
  }
  
}

public void deposit(double balance) 
{
 if(balance >= 25)
 {
	 super.deposit(total);
	 
    System.out.println("You deposited money." + balance );
 }
   else
   {
	  System.out.println("You are to low.");
   }
}


protected void monthlyProcess()
{
  if(withdraws > 4)
	  monthlySC = monthlySC + monthlySC;
   else
	   System.out.println("You did not go over 4 withdrawls this month." );

   }
}
