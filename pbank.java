public class pbank {
    public static void main(String[] args) {
        C[] c=new C[2];
        C c1=new C("abdul","1mj20ec001");
        C c2=new C("malikh","mvjec203");
        c[0]=c1;
        c[1]=c2;
        for(int i=0;i<c.length;i++){
            C oc=c[i];
            String name=oc.D();
            System.out.println("name="+name);
            String usn=oc.E();
            System.out.println("USN="+usn);

        }
    }
}
class C{
    private String n;
    private String ci;
    C(String un,String uci){
        
    }
    String D(){
        return n;
    }
    String E(){
        return ci;
    }
}