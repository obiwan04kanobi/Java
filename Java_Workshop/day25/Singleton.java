package day25;

public class Singleton {
    public static void main(String[] args) {
        Kunal obj = Kunal.getInstance();
        Kunal obj1 = Kunal.getInstance(); // obj and obj1 are same object.
        //output will be "I think I'am Listening" only once.
    }
}
class Kunal{
    
    static Kunal obj = new Kunal(); // Eager Initialization. Early Singleton. invoked at initilization.
    private Kunal(){
        System.out.println("I think I'am Listening");
    }
    public static Kunal getInstance(){
        return obj;
    }
}
