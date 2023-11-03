package accenture_programs;

//Let us see another example of default constructor  
//which displays the default values  
class DefaultConstructors{  
int id;  
String name;  
//method to display the value of id and name  
void display(){System.out.println(id+" "+name);}  

public static void main(String args[]){  
//creating objects  
	DefaultConstructors s1=new DefaultConstructors();  
	DefaultConstructors s2=new DefaultConstructors();  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  

