package accenture_programs;


//Java program to overload constructors  
class ConstructorOverloading_10{  
  int id;  
  String name;  
  int age;  
  //creating two arg constructor  
  ConstructorOverloading_10(int i,String n){  
  id = i;  
  name = n;  
  }  
  //creating three arg constructor  
  ConstructorOverloading_10(int i,String n,int a){  
  id = i;  
  name = n;  
  age=a;  
  }  
  void display(){System.out.println(id+" "+name+" "+age);}  
 
  public static void main(String args[]){  
  ConstructorOverloading_10 s1 = new ConstructorOverloading_10(111,"Karan");  
  ConstructorOverloading_10 s2 = new ConstructorOverloading_10(222,"Aryan",25);  
  s1.display();  
  s2.display();  
 }  
}  
