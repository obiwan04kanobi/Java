import java.util.Scanner;

class A{
    int a,b;
    void input_1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = sc.nextInt();
        System.out.print("Enter B: ");
        b = sc.nextInt();
        add(a,b);

    }

    int add(int a,int b){

        return a+b;
    }

}

class B extends A{

    int c;
    void input_2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C: ");
        c = sc.nextInt();

    }

    int add(int c){

        int sum = (a+b+c);
        return sum;
    }

}

class C extends B{

    int d;
    void input_3(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter D: ");
        d = sc.nextInt();
        mul(d);
    }
    int mul;
    int mul(int d){

        mul = (a+b+c) * d;
        return mul;

    }

}


public class multi_level_inheritance {
    public static void main(String[] args) {
        
        C p = new C();

        p.input_1();
        p.input_2();
        p.input_3();
        System.out.printf("(%d+%d+%d)*%d = %d",p.a,p.b,p.c,p.d,p.mul);

    }
}
