package accenture_programs;

public class Anonumousobject_4 {
        public static void main(String[] args) {
			new fact().findFact(5);
		}
}
class fact{
	int fact=1;
	void findFact(int n) {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is"+fact);
	}
}