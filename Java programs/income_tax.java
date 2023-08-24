import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Sacanner(System.in);
        System.out.println("Enter your Salary: ")
        int salary = sc.nextInt();
        
        if (salary < 250000){
            System.out.println("No TAX to be paid")
        }
        else if ( salary > 250000 & salary < 500000){
            System.out.println("TAX to be paid: "+(salary-250000)*(5/100))
        }
        else if ( salary > 500000 & salary < 1000000){
            System.out.println("TAX to be paid: "+(salary-250000)*(20/100))
        }
        else if ( salary > 1000000){
            System.out.println("TAX to be paid: "+(salary-250000)*(30/100))
        }
    }
}
