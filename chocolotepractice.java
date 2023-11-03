public class chocolotepractice {
    private int barcode;
    chocolotepractice(){
        this.barcode=10001;
    }
    public void setBarCode(int barcode){
        this.barcode=barcode;
    }
    public int getBarCode(){
        return barcode;
    } 
    public static void main(String[] args) {
        chocolotepractice ch=new chocolotepractice();
        System.out.println("Intial chocolate detaails");
        System.out.println(ch.barcode);
        ch.setBarCode(100001);
        System.out.println("after the edition");
        System.out.println(ch.getBarCode());
        
    }
   
    }
