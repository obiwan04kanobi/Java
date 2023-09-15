package day13;

import java.util.Scanner;

public class exceptions_6 {

    public static void exception(int num){

        try{
            if (num == 0){
                throw new ArithmeticException("Value cannot be zero");
            }
            else{
                System.out.println(num*num);
            }
        }
        catch(Exception e){

            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        exception(num);

        sc.close();
    }
}
