import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner task=new Scanner(System.in);
        System.out.println("enter thje number");
        int n=task.nextInt();
        System.out.println("eneter the choice");
        int choice=task.nextInt();
        task.close();
        if(choice==1){
           strong res=new strong();
           int a=res.amstrong(n);
           if(n==a){
System.out.println("it is amstrong number");

           }
           else{
            System.out.println("it is  not amstrong number");
           }
           
        }
        if(choice==2){
            lucknum s=new lucknum();
            int b=s.luck(n); 
            if(b%9==0){
                System.out.println("it is lucky number");
                
            }
            else{
                System.out.println("it is not a lucky number");
            }

        }
        
        
    }
    
}
class strong{
    int amstrong(int number){
            int on=number;
            int am=0;
            while(on!=0){
                int digit=on%10;
                am=am+(digit*digit*digit);
                on=on/10;


            }return am;



}
}
class lucknum{
        int luck(int number){
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


