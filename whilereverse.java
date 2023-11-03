import java.util.Scanner;
public class whilereverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt(); 
        sc.close();
        res sd=new res();
        int reversed=sd.reverse(n);
        System.out.println("the reversed numebr is: "+reversed); 
        res1 mk=new res1();
        int result=mk.resverse(n);
        System.out.println("reversed number is:"+result);
        res2 suf=new res2();
        int resu=suf.resver(n);
        System.out.println("resversed number is:"+resu);
    }
        
    }
    class res{
        int reverse(int number){
            int orginalnumber=number;
            int reversed=0;
            while(orginalnumber!=0){
                int digit=orginalnumber%10;
                reversed =reversed*10+digit;
                orginalnumber=orginalnumber/10;
            }
            return reversed;
        }

    }
    

class res1{
    int resverse(int number){
    int on=number;
    int rn=0;
    do{
         int digit=on%10;
                rn =rn*10+digit;
                on=on/10;

    }while(on!=0);
return rn;
    }
}
class res2{
    int resver(int number){
        int on=number;
        int rn=0;
        for(;on!=0;on=on/10){
            int digit=on%10;
                rn =rn*10+digit;
        }
        return rn;
    }
}