import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number=sc.nextInt();
        System.out.println("Enter the choice 1/2");
        int choice=sc.nextInt();
        if(choice==1){
            Armstrong Am=new Armstrong();
            boolean result=Am.Check(number);
            if(result==true){
                System.out.println("it is a armstrong number");
            }
            else{
                System.out.println("it is not a armstrong number");
            }
            
        }

    }
    
}
class Armstrong{
    boolean Check(int n){
        int digit=n;
        int armstrongnm=0;
        while(digit!=0){
            int num=digit%10;
            armstrongnm+=(num^3);
            digit/=10;
        }
        System.out.println(armstrongnm);
        if(n==armstrongnm){
            return true;
        }
        else{
            return false;
        }

    }
}
