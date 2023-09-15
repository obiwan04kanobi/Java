
import java.util.Scanner;

public class two_dimensional_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array: ");

        System.out.println("Row: ");
        int row = sc.nextInt(); //3

        System.out.println("Col: ");        
        int col = sc.nextInt(); //2
                
        int arr[][] = new int[row][col];

        System.out.println("Enter Elements: ");        
        for(int i =0;i<row;i++){

            for(int j =0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }

        }

        for(int i =0;i<row;i++){

            for(int j =0;j<col;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
