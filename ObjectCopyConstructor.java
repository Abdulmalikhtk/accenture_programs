package accenture_programs;


//Java program to initialize the values from one object to another object.  
class ObjectCopyConstructor{  
  int id;  
  String name;  
  //constructor to initialize integer and string  
  ObjectCopyConstructor(int i,String n){  
  id = i;  
  name = n;  
  }  
  //constructor to initialize another object  
  ObjectCopyConstructor(ObjectCopyConstructor s){  
  id = s.id;  
  name =s.name;  
  }  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){  
  ObjectCopyConstructor s1 = new ObjectCopyConstructor(111,"Karan");  
  ObjectCopyConstructor s2 = new ObjectCopyConstructor(s1);  
  s1.display();  
  s2.display();  
 }  
}  
