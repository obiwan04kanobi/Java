package day9;

import java.util.Scanner;

class fact{

    int num;
    int input(){

        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }

    int fac;
    int fac(){
        fac = 1;
        int i = 1;
        while (i <= num){
            fac *= i;
            i += 1;
        }

        return fac;
    }
}



public class factorial_1{
    public static void main(String[] args) {
        
        fact f = new fact();
        f.input();
        System.out.printf("Factorial of %d is %d",f.num,f.fac());

    }

}