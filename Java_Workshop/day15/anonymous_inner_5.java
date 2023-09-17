package day15;
/*
 * write a java code to check whether a number is negative, positive or zero using abstract classes in anonymous
 */

import java.util.Scanner;

abstract class check{
    abstract void checking(int n);
}


public class anonymous_inner_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();

        check ch = new check() {
            public void checking(int n){
                if (n < 0){
                    System.out.println("negative");
                }
                else if (n > 0){
                    System.out.println("positive");
                }
                else if (n == 0){
                    System.out.println("zero");
                }
            }
        };
        ch.checking(n);
        sc.close();
    }
}
