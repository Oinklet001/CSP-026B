public class BankAccount {

        public double balance;
        public double depositsAMonth;
        public double withdrawsAMonth;
        public double annualIR;
        public double monthlyServiceC;

      //A no arguemtn constructor
   
      public BankAccount()

        {

        }   
       
        //constructor
        public BankAccount(double balance, double annualIR){

        this.balance = balance;
        this.annualIR = annualIR;

        }
        //number of deposites
           public void deposit(double total)
            {
                balance += total;
                depositsAMonth += total;
            }
            //number of withdrawls
              public void withdraw(double total)
            {
                balance -= total;
                withdrawsAMonth += total;
            }
            
            public double calcInterest(double balance, double annualIR)
            {
            double monthlyIR = annualIR / 12;

            monthlyIR = balance * monthlyIR;

            balance = balance + monthlyIR;
            
            return balance;
            }
            
            public double monthlyProcess(double balance, double depositsAMonth, double withdrawsAMonth)
            {
            balance = balance - monthlyServiceC;
            withdrawsAMonth = 0;
            depositsAMonth = 0;
            monthlyServiceC = 0;
            
            return balance;
            }
}

