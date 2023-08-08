import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        if (age < 5){
            System.out.println("You are a Baby");
        }
        else if (age > 5 && age < 12){
            System.out.println("You are a kid");
        }
        else if (age > 12 && age < 15){
            System.out.println("You are a Teenager");
        }
        else if (age > 15 && age < 18){
            System.out.println("You are an Adolescent");
        }
        else{
            System.out.println("You are an Adult");
        }
    }
}
