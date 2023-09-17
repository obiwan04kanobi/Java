
import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i<size;i++){
            System.out.println("Enter Element in position "+i);
            arr[i] = sc.nextInt();

        }

        System.out.println("-------------------------");

        for(int i = (size-1); i>=0; i--){
            System.out.println("Element in postion "+i);
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
