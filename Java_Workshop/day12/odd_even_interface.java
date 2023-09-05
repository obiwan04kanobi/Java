package day12;

import java.util.Scanner;

// AN ABSTRACT CLASS
@FunctionalInterface 
interface Odd{

    public void odd(int num);

}

// AN ABSTRACT CLASS
@FunctionalInterface
interface Even{  

    public void even(int num);

}


class mayank implements Odd,Even{

    public void odd(int num){

        if (num % 2 != 0){
            System.out.println("not even");
        }
    }

    public void even(int num){

        if (num % 2 == 0){
            System.out.println("even");
        }
    }

}


public class odd_even_interface {
    public static void main(String[] args) {
        mayank n = new mayank();
        System.out.print("Enter Num: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        n.odd(num);
        n.even(num);

    }
}
