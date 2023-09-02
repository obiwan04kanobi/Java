
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array: ");
        
        int size = sc.nextInt(); //5
        
        int arr[] = new int[size];
        
        for (int i =0;i<size;i++){
            
            System.out.println("Enter Element "+ i+": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Elements in an array is");
        for (int i=0;i<size;i++){

            System.out.println("Elements in "+ i +": "+arr[i]);
        }
    }


}
