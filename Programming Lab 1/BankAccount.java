public abstract class BankAccount
{
   public double balance;
   public double deposits;
   public double withdraws;
   public double annualIR;
   public double monthlySC;



   //This is the constructor
   public double constructor(double balance1, double annualIR1) 
   {
     balance = balance1;
     annualIR = annualIR1;
     return balance;
   }

   public void deposit(double total)
   {
     balance = balance + total;
     deposits++;
    
   }
   public void withdraw (double total)
   {
     balance = balance - total;
     withdraws++;
   }

   private void calcInterest() 
   {
     double monthlyIR;
     double monthlyI;
     
     monthlyIR = (annualIR / 12);
     monthlyI = balance * monthlyIR;
     balance = balance + monthlyI;
   }

   protected void monthlyProcess() 
   {
     balance = balance - monthlySC;
     this.calcInterest();
     deposits = 0;
     withdraws = 0;
     monthlySC = 0;
   }

   public double getBalance()
   {
     return balance;
   }
}
