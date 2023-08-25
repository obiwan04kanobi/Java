import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int salary = sc.nextInt();
        
        if (salary < 250000){
            System.out.println("No TAX to be paid");
        }
        else if ( salary >= 250000 & salary < 500000){
            System.out.println("TAX to be paid: "+((salary-250000)*0.05));
        }
        else if ( salary >= 500000 & salary < 1000000){
            System.out.println("TAX to be paid: "+((salary-250000)*0.2));
        }
        else if ( salary >= 1000000){
            System.out.println("TAX to be paid: "+((salary-250000)*0.3));
        }
    }
}
