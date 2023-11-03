public class Array {
    public static void main(String[] args) {
         double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
         double  average=0;
         for(int i=0;i<salary.length;i++){
            double sum=salary[i];
            average+=sum;
            
          }
          
          average/=salary.length;
          System.out.println("the average salary of the employees is:"+average);
          int count=0;
          for(int i=0;i<salary.length;i++){
                 if(salary[i]>average){
                    count++;
                 }
          }
          System.out.println("the number of employees whose salary is greater than the average"+count);
          int sound=0;
          for(int i=0;i<salary.length;i++){
            if(salary[i]<average){
                sound++;
            }
            
            

          }
          System.out.println("the number of employees whose salary is lesser than  the average"+sound);
    }
    
}
