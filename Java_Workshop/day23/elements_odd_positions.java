package day23;
/*
 * write a java program to print the element which are at odd position in an array using collections
 */
import java.util.*;
public class elements_odd_positions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Elements at odd position are: ");
        for(int i=0;i<n;i++) {
            if(i%2!=0) {
                System.out.print(arr.get(i)+" ");
            }
        }
        sc.close();
    }
}