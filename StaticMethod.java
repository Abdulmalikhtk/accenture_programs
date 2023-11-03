package accenture_programs;
class employ{
	int id;
	String name;
	static String company_name;
	static void changeValue() {
		company_name="Dataflair";
	}
	public void display() {
		System.out.println(name+" "+id+" "+company_name);
	}
	employ(int i,String n){
		id=i;
		name=n;
	}
}
public class StaticMethod{
	public static void main(String[] args) {
		employ.changeValue();
		employ obj=new employ(401,"abdul") ;
		employ obj1=new employ(400,"malikh") ;
		obj.display();
		obj1.display();
	}
}
