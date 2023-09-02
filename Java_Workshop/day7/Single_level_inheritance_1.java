import java.util.Scanner;
class ParentClass{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        a = sc.nextInt();
        System.out.println("Enter B: ");
        b = sc.nextInt();

        add(a,b);

    }

    int sum_of_two;
    int add(int a,int b){

        sum_of_two = (a+b);
        return sum_of_two;
    }
}


class SubClass extends ParentClass{
    int c;
    void getdata(){
        
        Scanner sc = new Scanner(System.in);            
        System.out.println("Enter C: ");
        c = sc.nextInt();
    }

    int sum(){

        return (a+b+c);

    }

}

public class Single_level_inheritance_1{

    public static void main(String[] args) {
              
        SubClass p1 = new SubClass();
        p1.input();
        p1.getdata();

        System.out.println("Sum of two numbers is : "+p1.sum_of_two);
        System.out.printf("Sum of three numbers is : %d",p1.sum());

    }
}