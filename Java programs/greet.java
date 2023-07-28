import java.util.Scanner;


public class greet {
    public static void main(String[] args) {
        
        System.out.println("Simple program that greets the user by using their name");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name?: ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name+" !!");
        System.out.println("Have a nice Day !!");

    }    
}
