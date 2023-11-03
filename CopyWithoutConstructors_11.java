package accenture_programs;


class CopyWithoutConstructors_11{  
    int id;  
    String name;  
    CopyWithoutConstructors_11(int i,String n){  
    id = i;  
    name = n;  
    }  
    CopyWithoutConstructors_11(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    CopyWithoutConstructors_11 s1 = new CopyWithoutConstructors_11(111,"Karan");  
    CopyWithoutConstructors_11 s2 = new CopyWithoutConstructors_11();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  
