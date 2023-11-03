import java.util.Scanner;

public class enhancetask {
    public static void main(String[] args) {
        int[] arr=new int[5];
        takemarks(arr);
        System.out.println("values in the array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        }
        static void takemarks(int[] arr){
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                System.out.println("Enter the number");
                arr[i]=sc.nextInt();
                 
            }
            sc.close();
        }
    }

