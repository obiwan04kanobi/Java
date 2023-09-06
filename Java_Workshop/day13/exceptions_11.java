package day13;

// parent class, it's methods and it's data members cannot be implemented as final. Whereas, child class, it's methods and it's data members can be implemented as final. 
class A{ 
    public void show(){
        System.out.println("In show");
    }
}
final class B extends A{
    public void show(){
        System.out.println("In show");
    }
}


public class exceptions_11 {
    public static void main(String[] args) {

        final int a = 25;
        System.out.println(a);
        B obj = new B();
        obj.show();

    }
}
