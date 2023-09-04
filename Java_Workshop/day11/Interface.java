package day11;

//INTERFACE IS USED TO IMPLEMENT MULTIPLE INHERITANCE WHICH IS NOT SUPPORTED IN JAVA.

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
}

public class Interface {
    public static void main(String[] args) {
        mayank A = new mayank();
        A.show();
    }
}
