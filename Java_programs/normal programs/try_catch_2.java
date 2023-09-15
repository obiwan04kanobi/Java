import java.util.Scanner;

public class try_catch_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int marks [] = { 40, 50, 60 };
        
        System.out.print("Enter the array index: ");
        int index = sc.nextInt();

        System.out.print("Enter the value to divide with: ");
        int number = sc.nextInt();

        try {
            System.out.println("\nThe value at array index entered is: "+marks[index]);
            System.out.println("array-index/value is: "+marks[index]/number);
        } 
        catch (ArithmeticException e) {
            System.out.println("\nArithmetic exception occured");
            System.out.println(e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArray index out of bounds exception occured");
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("\nSome other exception occured");
            System.out.println(e);
        } 
        finally {
            System.out.println("\nEnd of the program");
        }
        sc.close();
    }
}
