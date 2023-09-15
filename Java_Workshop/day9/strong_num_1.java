package day9;

import java.util.Scanner;

public class strong_num_1 {
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        
        int n,i,fact_n,lastdig,total = 0,temp_n;
        n = sc.nextInt();
        temp_n = n;

        while(n != 0){

            i = 1;
            fact_n = 1;
            lastdig = n % 10;
            while(i <= lastdig){

                fact_n *= i;
                i++;
            }
            total += fact_n;
            n = n/10;
        }
        if (total == temp_n){

            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();
    }
}
