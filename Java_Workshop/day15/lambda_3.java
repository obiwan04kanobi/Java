package day15;

import java.util.Scanner;

/*
 * write a java code to find maximum b/w two numbers using lambda expression
*/

interface max{
    int maximum(int x,int y);
}

public class lambda_3 {
    public static void main(String[] args) {

        max max = (int x,int y) ->
        {   
            if(x>y){
                return x;
            }
            else{
                return y;
            }
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        System.out.println(max.maximum(x, y));

        sc.close();
    }
}
