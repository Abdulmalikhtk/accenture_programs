public class looplabelling {
    public static void main(String[] args) {
        int i,j;
        loop1: for(i=0;i<=10;i++){
            System.out.println();
            loop2: for(j=0;j<=10;j++){
                System.out.println(j+" ");
                if(j==5){
                    break loop1;
                }
            }
            
        }
    }
}
