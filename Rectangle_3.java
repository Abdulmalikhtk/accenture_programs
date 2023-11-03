package accenture_programs;

public class Rectangle_3 {
  public static void main(String[] args) {
	  inputRectangle r1=new inputRectangle();
	    inputRectangle r2=new inputRectangle();
	    r1.insert(11,5);
	    r2.insert(3,15);
	    r1.displayArea();
	    r2.displayArea();
	    new inputRectangle().displayArea();
}
    
}

class inputRectangle{
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void displayArea() {
		System.out.println("the Area is "+(length*width));
	}
}
