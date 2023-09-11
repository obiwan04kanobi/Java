package day14;

import java.util.Scanner;

/*
Q.  write a java code to check if number is even or odd number using inner classes but print even numbers 
    using outer class methods and print odd numbers using inner class methods
*/

class Outer{
    
    void even(){

        System.out.println("Even number");
    }

    class Inner{

        void odd(){

            System.out.println("Odd number");
        }
    }
}                                          

public class access_modifiers_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Num: ");
        int num = sc.nextInt();

        Outer ou = new Outer();
        Outer.Inner in = ou.new Inner();

        if(num % 2 == 0){
            ou.even();
        } 
        else{
            in.odd();
        }  
    }
}
