import java.util.Scanner;
public class Amstrongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt(); 
        sc.close();
        strong sd=new strong();
        int amstring=sd.amstrong(n);
        System.out.println("amstrong number is:"+amstring);
        if(n==amstring){
            System.out.println("the number "+amstring+"is a amstrong number");
        }
        else{
            System.out.println("it is not a amstrong number");
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