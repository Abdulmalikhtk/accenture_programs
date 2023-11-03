public class Shoetor{
    public static void main(String[] args) {
        double balance = 600;   // Balance in the account
        System.out.println("Amount to withdraw");
        double amount = 1500;   // Amount to be withdrawn
        if(amount > 0 && amount < balance) {    // Using OR operator.
          System.out.println("Withdrawal suc.");
        }
        else {
          balance -= amount;
          System.out.println("Withdrawal has failed");
          System.out.println(balance);
        }
      }
      
        
    

    
}
