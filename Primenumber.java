import java.util.Scanner;
class Primenumber {
  public static void main(String[] args) {
    double balance = 0;
    double minbal = 500;
    double depositAmt = 0;
    Scanner sc = new Scanner(System.in);
       
    while(depositAmt < minbal) {
        System.out.println("Enter the amount to be deposit");
      depositAmt = sc.nextInt();
    }
    balance = depositAmt;
    System.out.println("Your deposit was successful");
  }
}
