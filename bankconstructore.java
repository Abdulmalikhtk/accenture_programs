public class bankconstructore {
    private String bankName;
    private String area;
    private String phoneNo;
    bankconstructore(){
        bankName="Canara";
        area="RM nagar";
        phoneNo="63388993892";
    }
    void displayBank(){
        System.out.println("The Bank Name is :"+bankName);
        System.out.println("the bank area is :"+area);
        System.out.println("the phone no is :"+phoneNo);
    }
    bankconstructore(String ibankName,String iarea,String iphoneNo){
        bankName=ibankName;
        area=iarea;
        phoneNo=iphoneNo;
    }
   public static void main(String[] args) {
     bankconstructore bank1=new bankconstructore();
     bankconstructore bank2=new bankconstructore("sbi", "gandhipura", "9830920902");
       bank1.displayBank();
       System.out.println("****************************************************");
   bank2.displayBank();

   }
 
}
