import java.util.Scanner;

public class calculator_1 {


    //SUM METHOD/FUNCTION
    public void sum(int a,int b){
        int sum = a+b;
        System.out.printf("%d + %d = %d",a,b,sum);
    }

    //MAIN CLASS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Int A: ");
        int a = sc.nextInt();


        System.out.println("Int B: ");
        int b = sc.nextInt();

        calculator_1 s = new calculator_1(); // CREATING AN OBJECT OF CLASS 
        s.sum(a,b); // CALLING METHOD SUM USING THE CREATED OBJECT

        sc.close();
    }
}
