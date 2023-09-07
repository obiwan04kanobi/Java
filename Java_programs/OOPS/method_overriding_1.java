
class A{

    public int a;
    public int harry(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }

}

class B extends A{

    @Override   //should use the @Override annotation when overrinding an method, helps to debug the code later
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }

}

public class method_overriding_1 {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();


        B b = new B();
        b.meth2();
    }
}
