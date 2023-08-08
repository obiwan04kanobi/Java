import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        /* 
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
        */

        switch(age){
            case 18:
            System.out.println("You are going to become an Adult!");
            break;
            
            case 23:
            System.out.println("You are going to join a Job!");
            break;

            case 60:
            System.out.println("You are going to get retired!");
            break;

            default:
            System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}
