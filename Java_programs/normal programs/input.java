import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");

        // "System.in" means we are taking input from the keyboard
        Scanner sc = new Scanner(System.in); // creating an object of "scanner" class or in other words we are creating an instance of the "scanner" class.
        
        System.out.println("First number is:");
        int a = sc.nextInt();

        System.out.println("Second number is:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("Sum of the two numbers is: ");
        System.out.println(sum);


        sc.close();
    }
}
