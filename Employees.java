class Employee {
    int empId;
    String name;
    double Salary;
    public double getSalary(){
        return Salary;
    }
     public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
         this.name=name;
    }
}
class pemanentEmployee extends Employee{
    double basicPay;
    double hra;
    int experience;
    public double getBasicPay(){
        return basicPay;
    }
    public void setBasicPay(double basicPay){
        this.basicPay=basicPay;
        
    }
     public double getHra(){
        return hra;
    }
      public void setHra(double hra){
        this.hra=hra;
        
    }
    public int getExperience(){
        return experience;
    }
      public void setExperience(int experience){
        this.experience=experience;
        
    }
    public double calculateSalary(int experience){
        int p=0;
        if(experience<3){
            p=0;
        }
        else if(experience>=3 && experience<5){
            p=5; 
         }
        else if(experience>=5 && experience<10){
            p=7;
        }
        else if(experience>=10){
            p=12;
        }
        // float f=(float) ((p/100)*basicPay);
        double F=(p/100.0);
        Salary=(F*basicPay)+basicPay+hra;
        return Salary;
         
        
          
    }
}
class contractEmployee extends Employee{
    double wage;
    int hours;
    public double getWage(){
        return wage;
    }
    public void setWage(double wage){
        this.wage=wage;
    }
     public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours=hours;
    }
    public double calculateSalary(){
        Salary=hours*wage;
        return Salary;
    }

}
public class Employees{
    public static void main(String[] args) {
        pemanentEmployee pm=new pemanentEmployee();
        pm.name="Anil";
        pm.empId=101;
        pm.basicPay=10000;
        pm.hra=1500;
        pm.experience=3;
        int ex=pm.experience;
        double esalary=pm.calculateSalary(ex);
        System.out.println("Permanent Employee: Your salary is" +esalary);
        contractEmployee cm=new contractEmployee();
        cm.name="Ankit";
        cm.empId=102;
        cm.wage=500;
        cm.hours=10;
        double csalary=cm.calculateSalary();
        System.out.println("Contract Employee: Your salary is:"+csalary);

    }
}