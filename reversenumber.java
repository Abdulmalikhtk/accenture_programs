import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find the reverse of the number");
        int a=sc.nextInt();
        int f=a/10;
        if(f>=10){
             f=a/10;
        }
        int l=a%10;
        int fr=l*10;
        int Rn=fr+f;
        System.out.println("the reversed number is"+Rn);
    }
}
