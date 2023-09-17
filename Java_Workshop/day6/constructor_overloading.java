import java.util.Scanner;

public class constructor_overloading {

    String name;
    int r_no;
    int age;

    //non-parameterized constructor
    constructor_overloading(){

        name = "Java";
        r_no = 400;
        age = 25;
    }

    //parameterized constructor
    constructor_overloading(String name, int r,int age){

        this.name = name;
        r_no = r;
        this.age = age;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name:");
        String name = sc.nextLine();
        
        System.out.println("Roll No:");
        int r = sc.nextInt();

        System.out.println("Age:");
        int age = sc.nextInt();

        constructor_overloading p1 = new constructor_overloading();
        constructor_overloading p = new constructor_overloading(name, r, age);

        System.out.printf("Name: %s, Age: %d, Roll No: %d\n",p1.name,p1.age,p1.r_no);
        System.out.printf("Name: %s, Age: %d, Roll No: %d",p.name,p.age,p.r_no);

        sc.close();

    }
}
