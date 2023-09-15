package day8;

import java.util.Scanner;

class Parent{

    int add(int a, int b){

        return (a+b);

    }

}

class child extends Parent{

    int add(int a, int b, int c){

        return (a+b+c);

    }    

}


public class method_overloading {
     public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("A: ");
        a = sc.nextInt();

        System.out.printf("B: ");
        b = sc.nextInt();

        System.out.printf("C: ");
        c = sc.nextInt();        

        child child = new child();

        System.out.println("Addition of two numbers: "+child.add(a,b));
        System.out.printf("Addition of three numbers: %d",child.add(a, b, c));

        sc.close();
    }
}
