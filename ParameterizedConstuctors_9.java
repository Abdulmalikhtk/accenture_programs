package accenture_programs;

//Java Program to demonstrate the use of the parameterized constructor.  
class ParameterizedConstuctors_9{  
  int id;  
  String name;  
  //creating a parameterized constructor  
  ParameterizedConstuctors_9(int i,String n){  
  id = i;  
  name = n;  
  }  
  //method to display the values  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){  
  //creating objects and passing values  
	  ParameterizedConstuctors_9 s1 = new ParameterizedConstuctors_9(111,"Karan");  
	  ParameterizedConstuctors_9 s2 = new ParameterizedConstuctors_9(222,"Aryan");  
  //calling method to display the values of object  
  s1.display();  
  s2.display();  
 }  
}  

