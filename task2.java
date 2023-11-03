import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//object for input
        System.out.println("enter the number");
        int num=sc.nextInt();//input stateme
        ask tht=new ask();
        int result=tht.res(num);//calling the method
        System.out.println("the reversed numbr is:"+result);
        

         

    }
    
}
class ask{
    int res(int number){
        int  originalnumber=number;//decleration the variable
        int reversednumber=0;
        while(originalnumber!=0){
            int digit=originalnumber%10;
            reversednumber=reversednumber*10+digit;
            originalnumber/=10;
        }
        return reversednumber;

    }
}
