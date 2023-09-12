package day15;
/*
 * write a java code to check whether a number is divisible by 5 and 11 or not using normal anonymous inner class
 */

import java.util.Scanner;

class anony{

    void anonymous(int n){
        System.out.println("Hello");
    }
}

public class anonymous_inner_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();
        
        anony ano = new anony(){
            
            @Override
            void anonymous(int n){
                
                if (n % 11 == 0 && n % 5 == 0){
                    System.out.println("divisible by 11 and 5");
                }
                else if (n % 11 == 0){
                    System.out.println("divisible by 11");
                }
                else if (n % 5 == 0){
                    System.out.println("divisible by 5");                    
                }
                else{
                    System.out.println("Not divisible by either 5 or 11");
                }
            }
        };
        ano.anonymous(n);

    }
}
