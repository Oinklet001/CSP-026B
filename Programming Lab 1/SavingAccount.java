public class SavingAccount extends BankAccount  {

  private int deposite;
  private int withdrawls;
  private int minAmount = 25;
   
   
   public SavingAccount(){
		deposite=0;
		withdrawls=0;
	}
  
  

  public boolean desposit (double total)
   {
       if (minAmount > total) 
       {
           return true;
        }
        else 
        
        return false;
    }

    public  double withdrawA (double total)
   {
       if (true) 
       {
          super.withdraw(total);
          
          return total;
       
       
        } 
       else
       
      return total;
    }


    public void monthlyProcess()

    {

      if(withdrawsAMonth > 4)

        {

            monthlyServiceC = monthlyServiceC + withdrawsAMonth - 4;

        }

        super.monthlyProcess();

        if(balance < 25)

            return;
      }


}
