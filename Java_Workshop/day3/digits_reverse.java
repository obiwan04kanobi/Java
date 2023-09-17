package day3;
import java.util.Scanner;

public class digits_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //128
        int rev = 0;
        while (n != 0) 
        {
            int rem = n % 10;   //8 -> 2 -> 1
            rev = (rev * 10) + rem;   //8 -> 80 + 2 -> 820 + 1
            n = n / 10;   //128 -> 12 -> 1 -> 0
        }
        System.out.println(rev);    //821

        sc.close();
    }
}
