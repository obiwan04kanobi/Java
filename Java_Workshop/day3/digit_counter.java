package day3;
import java.util.Scanner;

public class digit_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        do{
            ++count;
            n= n/10;
        }while(n!=0);
        System.out.println(count);

        sc.close();
    }
}
