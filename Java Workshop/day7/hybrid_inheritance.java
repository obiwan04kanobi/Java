import java.util.Scanner;

class A{

    // a, b
    int a,b;
    void input(){
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

        return a-b-c;

    }

}


class C extends B{

    // get d
    int d;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("D: ");
        d = sc.nextInt();
    }

    // d/c
    float divide(){
        return d/c;
    }

}


class D extends B{


    //get e
    int e;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("D: ");
        e = sc.nextInt();

    }

    //e*a
    int mul(){

        return e*a;

    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        
    }   
}
