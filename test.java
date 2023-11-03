import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n=sc.nextInt();
        ReverseWhile R=new ReverseWhile();
        R.RWhile(n);
        ReverseFor RF=new ReverseFor();
        RF.Rfor(n);
        Donewhile DW=new Donewhile();
        int reversedNumberDoWhile=DW.RDoWhile(n);
        System.out.println("the reversed number for the do while loop is"+reversedNumberDoWhile);
       sc.close();
       

}
}
class ReverseWhile{
    void RWhile(int number){
        int originalNumberWhile=number;
        int reversedNumberWhile=0;
        while(originalNumberWhile!=0){
            int digit=originalNumberWhile%10;
            reversedNumberWhile=reversedNumberWhile*10+digit;
            originalNumberWhile /= 10;
        }

        System.out.println("The reversed number is "+reversedNumberWhile);
        

    }
}
class ReverseFor{
    void Rfor(int number){
        int originalNumberFor=number;
        int reversedNumberFor=0;
        for(;originalNumberFor!=0;originalNumberFor/=10){
            int digit=originalNumberFor%10;
            reversedNumberFor=reversedNumberFor*10+digit;
        }
        System.out.println("the reversed number using for is : "+reversedNumberFor);
    }
}
class Donewhile{
    int RDoWhile(int number){
        int originalNumberDoWhile=number;
        int reversedNumberDoWhile=0;
        do{
            int digit=originalNumberDoWhile%10;
            reversedNumberDoWhile=reversedNumberDoWhile*10+digit;
            originalNumberDoWhile/=10;
        }while(originalNumberDoWhile!=0);
        return reversedNumberDoWhile;
    }
}