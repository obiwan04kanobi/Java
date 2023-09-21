class Outer{
    void display_1(){
        System.out.println("in outer class");
    }
    class Inner{
        void display(){
            System.out.println("Hello");
        }
    }
}


public class inner_1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        o.display_1();
        i.display();
    }
}
