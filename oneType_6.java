package accenture_programs;

public class oneType_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects  
		  r1.insert(11,12);  
		  r2.insert(3,15);  
		  r1.calculateArea();  
		  r2.calculateArea();  


	}

}
class Rectangle{  
	 int length;  
	 int width;  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	 void calculateArea(){System.out.println(length*width);}  
	}  
