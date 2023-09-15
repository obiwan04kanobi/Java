import java.util.Scanner;

public class marks_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to calculate the Percentage obtained by a Student in 5 subjects");
        System.out.println("Maximum marks of each subject: ");
        float maxmarks = sc.nextFloat();
        System.out.println("Marks in 1st Subject:");
        float sub1 = sc.nextFloat();
        System.out.println("Marks in 2nt Subject:");
        float sub2 = sc.nextFloat();
        System.out.println("Marks in 3rd Subject:");
        float sub3 = sc.nextFloat();
        System.out.println("Marks in 4th Subject:");
        float sub4 = sc.nextFloat();
        System.out.println("Marks in 5th Subject:");
        float sub5 = sc.nextFloat();

        float perct = ((sub1 + sub2 + sub3 + sub4 + sub5)/(5*maxmarks))*100;
        System.out.println("Percentage is:");
        System.out.println(perct);

        sc.close();
    }
}
