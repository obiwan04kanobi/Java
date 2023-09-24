import java.util.Scanner;

public class recursion_factorial {

    static int factorial_2(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial_2(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.printf("Factorial of %d is: %d\n",n,factorial_2(n));
        sc.close();
    }
}
