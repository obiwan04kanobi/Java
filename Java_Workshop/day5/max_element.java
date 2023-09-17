

import java.util.Scanner;

public class max_element {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array: ");
        
        int size = sc.nextInt(); //5
        
        int arr[] = new int[size];

        int max = arr[0];

        for (int i =0;i<size;i++){
            
            System.out.println("Enter Element "+ i+": ");
            arr[i] = sc.nextInt();
        }

        //algo for max element in array
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Greatest number is: "+max);

        sc.close();

    }

}

