import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        System.out.println("Kilometer to Miles Converter");
        Scanner sc = new Scanner(System.in);
        System.out.println("Distance in Km:");
        double km = sc.nextFloat();

        double convert = km * 0.621371;
        
        System.out.println("Distance in Miles:");
        System.out.println(convert);
    }
}
