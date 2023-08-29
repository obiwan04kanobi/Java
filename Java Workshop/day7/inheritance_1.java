import java.util.Scanner;
class ParentClass{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        add(a,b);

    }

    int add(int a,int b){

        return a+b;

    }
}


class SubClass extends ParentClass{
    int c;
    void getdata(){
        
        Scanner sc = new Scanner(System.in);            
        System.out.println("Enter C: ");
        int c = sc.nextInt();
    }

    int sum(){

        return (a+b+c);

    }

}

public class inheritance_1{

    public static void main(String[] args) {
              
        ParentClass p = new ParentClass();
        SubClass p1 = new SubClass();
        p.input();
        System.out.printf("Sum of two numbers: %d",p.add());
        p.getdata();
        p1.sum(0);
        System.out.printf("Sum of three numbers is : %d",p1.sum_1);

    }
}