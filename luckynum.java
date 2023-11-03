import java.util.Scanner;
public class luckynum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt(); 
        sc.close();
        lucknum sd=new lucknum();
        int luck=sd.lucky(n);
        System.out.println("lucky number is "+luck);
    }
}
    class lucknum{
        int lucky(int number){
            int on=number;
            int ln=0;
            int position=1;
            while(on!=0){
               int  digit=on%10;
               if(position%2!=0){
                 ln=ln+digit*digit;
               }
               on=on/10;
               position++;
            }
            return ln;
        }


    
    

    
}
