public class interest {
    
        
        public static void main(String[] args) {
        double balance=6000,rateOfInterest=0.10,interest=0;
        double depositAmt=600,withdrawal=500;
           for(int i=1;i<=12;i++){
                balance+=depositAmt;
                balance-=withdrawal;
                interest=balance*rateOfInterest;
                balance+=interest;
                System.out.println("the interest for the month"+i+"is:"+interest);
           }
           System.out.println("the total balance at the end of the year is "+balance);
        }
}
