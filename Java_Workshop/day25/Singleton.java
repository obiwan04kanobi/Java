package day25;

public class Singleton {
    public static void main(String[] args) {

        //threads method will take 100 miliseconds each to execute, which is a lot so, it is not recommended.
        Thread t1 = new Thread(new Runnable(){
            
            public void run(){
                Kunal obj = Kunal.getInstance();
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            
            public void run(){
                Kunal obj1 = Kunal.getInstance();
            }
        });

        t1.start();
        t2.start();

        //Kunal obj = Kunal.getInstance();
        //Kunal obj1 = Kunal.getInstance(); // obj and obj1 are same object.
        //output will be "Instance Created" only once.
    }
}

/* class Kunal{
    
    static Kunal obj = new Kunal(); // Eager Initialization. Early Singleton. invoked at initilization.
    private Kunal(){
        System.out.println("Instance Created");
    }
    public static Kunal getInstance(){

        return obj;
    }
} */

class Kunal{

    static Kunal obj; // Lazy Initialization. Late Singleton. invoked at first call.
    private Kunal(){
        System.out.println("Instance Created");
    }
    public static Kunal getInstance(){
         if (obj==null) {
            obj = new Kunal(); // will display "Instance Created" only once.
        } 
        
        //obj = new Kunal(); // will display "Instance Created" twice.
        return obj;
    }
}
