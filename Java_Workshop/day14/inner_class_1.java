package day14;

class Outer{
    int a = 50;
    void show(){
        System.out.println("Inside Outer Class");
    }
    
    class Inner{
        int b = 100;
        void show(){
            System.out.println("Inside Inner Class");
    
        }

        void show1(){
            System.out.println("Another way of using inner class");
        }
    }
}

public class inner_class_1 {
    public static void main(String[] args) {
        Outer o = new Outer();
                
        o.show();
        System.out.println(o.a);


        Outer.Inner i = o.new Inner();
        i.show();
        System.out.println(i.b);

        Outer.Inner in = new Outer().new Inner();
        in.show1();
    }
}
