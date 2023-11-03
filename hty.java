public class hty {
    public static void main(String[] args) {
        employees nc=new employees();
        double avg=nc.calcAverage();
        System.out.println("av");
    }
    
}
class employees{
    public double calcAverage(){
        double[] salary={23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
    double sum=0;
   for(int i=0;i<salary.length;i++){
      double s=salary[i];
      sum=sum+s;
    }
    double average=sum/5;
   return average;
    }

}
