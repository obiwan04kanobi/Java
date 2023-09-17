import java.util.Scanner;

public class no_paramater_constructor_1 {

    String name;

    //Non-Parameterized Constructor
    no_paramater_constructor_1(){

        System.out.println("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        
        sc.close();

    }

    public static void main(String[] args) {
        
        no_paramater_constructor_1 tmp = new no_paramater_constructor_1();

        System.out.printf("Hello, %s",tmp.name);

    }
}
