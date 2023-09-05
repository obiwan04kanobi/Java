package day11;

// INTERFACE IS USED TO IMPLEMENT MULTIPLE INHERITANCE WHICH IS NOT SUPPORTED IN JAVA.
// INTERFACES HELP US TO ACHIEVE ABSTRACTION IN JAVA

// AN ABSTRACT CLASS
@FunctionalInterface //once @FunctionalInterface is written over an abstract class it means that it will be now a functional interface and can only have 1 single method defined inside it, no more than that.
interface Pyramid{

    public void show();

}

// AN ABSTRACT CLASS
interface Trainer{  //Normal or multiple interface

    public void show();
}

//METHOD mayank INHERITS ABSTRACT CLASSES WHICH MEANS IT SHOULD HAVE METHODS DEFINED INSIDE ABSTRACT CLASSES
class mayank implements Pyramid,Trainer{

    public void show(){
        System.out.println("It's working fine");
    }    
    public void show1(){
        System.out.println("We can also put our own child class method");
    }
}

public class Interface {
    public static void main(String[] args) {
        mayank A = new mayank();
        A.show();
        A.show1();
    }
}
