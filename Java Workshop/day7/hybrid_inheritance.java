import java.util.Scanner;

class A{

    // a, b
    int a,b;
    void input_1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        a = sc.nextInt();

        System.out.print("B: ");
        b = sc.nextInt();
    }

    // a+b
    int add(){
    
        return a+b;

    }

}

class B extends A{

    // get c
    int c;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("C: ");
        c = sc.nextInt();

    }

    //  a-b-c
    int sub(){

        return (a-b-c);

    }

}


class C extends B{

    // get d
    int d;
    void input_2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("D: ");
        d = sc.nextInt();
    }

    // d/c
    float divide(){
        return (d/c);
    
    }

}


class D extends B{


    //get e
    int e;
    void input_3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("E: ");
        e = sc.nextInt();

    }

    //e*a
    int mul(){

        return (a*e*b);
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        
        C c = new C();
        D d = new D();
        
        c.input_1();
        c.getdata();
        c.input_2();
        d.input_3();

        System.out.println("Add: "+c.add());

        System.out.println("Sub: "+c.sub());

        System.out.printf("Div: %.2f",c.divide());
        System.out.println();

        System.out.println("Mul: "+d.mul());

    }   
}
