public class Shortand {
    public static void main(String[] args) {
        double balance = 2600;
        System.out.println("Amount to withdraw");
        double amount = 1500, limit = 10000, minbal = 500;
        if(amount <= limit && (balance - amount) > minbal) {    // Using AND
          balance -= amount;
          System.out.println("Withdrawal has succeeded");
          System.out.println(balance);
        }
      }
      
    
}
