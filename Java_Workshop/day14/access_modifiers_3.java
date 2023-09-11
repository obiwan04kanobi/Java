package day14;

import java.util.Scanner;

/*
*  write a java code to check if number is even or odd number using inner classes but print even numbers 
*  using outer class methods and print odd numbers using inner class methods
*/

class Outer_2{
    
    void even(){

        System.out.println("Even number");
    }

    class Inner_2{

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

        Outer_2 ou = new Outer_2();
        Outer_2.Inner_2 in = ou.new Inner_2();

        if(num % 2 == 0){
            ou.even();
        } 
        else{
            in.odd();
        }  
    }
}
