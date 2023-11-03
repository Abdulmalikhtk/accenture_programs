  class input1 {
    int billid=1001;
    int customerid=101;
    float discount=2;
    float billamount=199.99f;
    
}
 class input2{
    int billid=1002;
    int customerid=102;
    float discount=0.04f;
    float billamount=210.5f;

}
public class Discount{
    public static void main(String[] args) {
        input1 dis=new input1();
        double discontedbillamount=dis.billamount-dis.billamount*(dis.discount/100);

        System.out.println("Discount for input1:" + discontedbillamount);
        input2 dis1=new input2();
        double discontedbillamount1=dis1.billamount-dis1.billamount*(dis1.discount/100);
        System.out.println("Discount for input2:" +discontedbillamount1);
}
}