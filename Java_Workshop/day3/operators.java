package day3;
import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // user input
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        
        //user input
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;

        //print output
        System.out.println("Sum: ");
        System.out.println(sum);
        System.out.println("Sub: ");
        System.out.println(sub);
        System.out.println("Mul: ");
        System.out.println(mul);

        sc.close();
    
    }   
}
