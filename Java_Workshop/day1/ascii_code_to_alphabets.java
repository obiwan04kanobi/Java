package day1;

import java.util.Scanner;

public class ascii_code_to_alphabets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int: ");
        int n = sc.nextInt();
        System.out.println((char)n); //typecasting from integer to character
        sc.close();
    }
}
