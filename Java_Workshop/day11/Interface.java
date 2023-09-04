package day11;

//INTERFACE IS USED TO IMPLEMENT MULTIPLE INHERITANCE WHICH IS NOT SUPPORTED IN JAVA.
// INTERFACES USES ABSTRACT CLASSES TO IMPLEMENT MULTIPLE INHERITANCE.

interface Pyramid{

    public void show();

}

interface Trainer{
    public void show();
}

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
