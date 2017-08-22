public class BankAccount {

        public double balance;
        public double depositsAMonth;
        public double withdrawsAMonth;
        public double annualIR;
        public double monthlyServiceC;

        //constructor
        public BankAccount(double balance, double annualIR){

        this.balance = balance;
        this.annualIR = annualIR;

        }
        
           public void deposit(double total)
            {
                balance += total;
                depositsAMonth += total;
            }
            
              public void withdraw(double total)
            {
                balance -= total;
                withdrawsAMonth += total;
            }
            
            public calcInterest()
            {
            
            }
}
