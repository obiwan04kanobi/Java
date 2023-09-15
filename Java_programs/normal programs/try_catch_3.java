import java.util.Scanner;

public class try_catch_3 {
    public static void main(String[] args) {
        int marks [] = { 40, 50, 60 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Welcome to the try block of main");
            
            try{
                System.out.println(marks[index]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds exception occured");
                System.out.println("Exception in level 2"); //level 2 means that exception is in nested try block
            }

        } 
        catch (ArithmeticException e) {
            System.out.println("Exception in level 1"); //level 1 means that exception is in try block of main
        } 
        finally {
                System.out.println("End of the program");
        }
        sc.close();
    }
}
