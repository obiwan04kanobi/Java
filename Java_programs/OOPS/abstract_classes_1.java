
//abstract class
abstract class Parent{

    //abstract method
    abstract public void greet();

}

class Child extends Parent{

    @Override
    public void greet(){
        System.out.println("Namaste 🙏");
    }

    //Any other method not in abstract classes can also be implemented in Child class
    public void hello(){
        System.out.println("Not an abstract method");
    }
}


public class abstract_classes_1 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.greet();
        ch.hello();
    }
}
