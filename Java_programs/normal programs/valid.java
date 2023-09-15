import java.util.Scanner;

public class valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check if the given value is valid");
        System.out.println("Give an integer");
        boolean b1 = sc.hasNextInt();   // this line of code will check if the given value is an integer or not and print "true" or "false" accordingly.
        System.out.println(b1);
        sc.close();
    }
}
