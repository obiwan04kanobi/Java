import java.util.Scanner;

public class temp {

    String name;

    //Non-Parameter Constructor
    temp(){

        System.out.println("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();         

    }

    public static void main(String[] args) {
        
        temp tmp = new temp();

        System.out.printf("Hello, %s",tmp.name);

    }
}
