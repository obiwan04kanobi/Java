package day15;

import java.util.Scanner;

@FunctionalInterface
interface Square{
    abstract void square_num(int num);
}

public class anonymous_inner_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int num = sc.nextInt();

        Square sq = new Square() {
            public void square_num(int num){
                System.out.println("Square of "+num+" is: "+num*num);
            }
        };
        sq.square_num(num);
    }
}
