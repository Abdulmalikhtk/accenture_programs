import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
  double balance = 0, minbal = 500, depositAmt = 0;
  Scanner sc = new Scanner(System.in);    //Scanner class is used to accept input from the keyboard.
  do {      // do-while executes once vefore the condition is tested, then repeats till the condition is satisfied.
    System.out.println("Enter the amount to be deposited");
    depositAmt = sc.nextInt();
  } while(depositAmt < minbal);   // The condition is given inside the while keyword.
  balance = depositAmt;
  System.out.println("Your deposit was successful");
}

    
}
