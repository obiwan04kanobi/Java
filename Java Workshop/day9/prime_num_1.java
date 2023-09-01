package day9;

import java.util.Scanner;

class new_1{

    boolean prime(int n){
        for(int i = 2;i<n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

}



public class prime_num_1 {
    public static void main(String[] args) {
        
        new_1 n = new new_1();

        System.out.print("Enter range for which you want the prime numbers: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        for(int i = 1; i <= num;i++){

            if (n.prime(i)){

                System.out.println(i);

            }
            else{
                continue;
            }

        }


    }
}
