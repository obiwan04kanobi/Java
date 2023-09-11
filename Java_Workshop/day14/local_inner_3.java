package day14;

import java.util.Scanner;

class Outer_4{

    void print(int n){
        class NesRevOut{
            void reve(int n){
                int rev = 0,rem = 0,temp = n;
                while(temp != 0){

                    rem = temp%10;
                    rev = (rev*10) + rem;
                    temp = temp/10;
                }
                
                if (rev < 0){
                    rev = rev * (-1);
                    System.out.println(rev+"-");
                }                
                else{
                    System.out.println(rev);
                }
                
            }
        }
        NesRevOut rev = new NesRevOut();
        rev.reve(n);
    }

}


public class local_inner_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Outer_4 o = new Outer_4();
        o.print(n);
    }
}
