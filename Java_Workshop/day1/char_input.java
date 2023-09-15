package day1;
import java.util.Scanner;

public class char_input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        char name = sc.next().charAt(0);
        System.out.print("hello, ");
        System.out.println(name);
        sc.close();

    }
}
