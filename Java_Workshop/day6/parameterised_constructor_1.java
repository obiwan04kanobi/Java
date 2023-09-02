import java.util.Scanner;

public class parameterised_constructor_1 {

    String name;
    int age;
    int roll_no;

    // Parameterised Constructor
    parameterised_constructor_1(String name,int age,int roll){

        this.name = name; //if the reference variable is same as the 
        this.age = age;
        roll_no = roll;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        System.out.println("Roll No: ");
        int roll = sc.nextInt();

        parameterised_constructor_1 p = new parameterised_constructor_1(name,age,roll);

        System.out.printf("Name: %s, Age: %d, Roll No: %d",p.name,p.age,p.roll_no);


    }

}
