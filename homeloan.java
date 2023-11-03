public class homeloan {
    public static void main(String[] args) {
        homeloancheck hm=new homeloancheck();
        double amount=hm.calculateEmi(200000);
        System.out.println("Home loan emi per year..."+amount);
    }
}
class loan{
    int tenure;
    float interestrate;
    public double calculateEmi(float principle){
      double SI=(principle*interestrate*tenure)/100;
      double emi=(SI+principle)/tenure;
      return emi;

    }
}
class homeloancheck extends loan{
    homeloancheck(){
    tenure=5;
    interestrate=8.5f;
    }

}