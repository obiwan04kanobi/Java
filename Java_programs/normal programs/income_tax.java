import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        float salary = sc.nextFloat();
        float tax = 0;
        
        if (salary < 250000){

            System.out.println("No TAX to be paid");
        }
        else if ( salary >= 250000 & salary < 500000){

            tax = tax + (salary-250000)*(0.05f);
            System.out.println("TAX to be paid: "+tax);
        }
        else if ( salary >= 500000 & salary < 1000000){

            tax = tax + (500000-250000)*(0.05f);
            tax = tax + (salary-250000)*(0.20f);
            System.out.println("TAX to be paid: "+tax);
        }
        else if ( salary >= 1000000){

            tax = tax + (500000-250000)*(0.05f);
            tax = tax + (1000000-500000)*(0.20f);
            tax = tax + (salary - 1000000)*(0.30f);
            System.out.println("TAX to be paid: "+tax);
        }

        sc.close();
    }
}
