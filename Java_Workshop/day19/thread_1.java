package day19;

//in threads we cannot expect correct output because it purely depends on the compiler

class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500); //half a second
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Hello extends Thread{ 
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500); //half a second
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}


public class thread_1 {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        try {
            Thread.sleep(10); //half a second
        } catch (Exception e) {
            // TODO: handle exception
        }
        obj2.start();
    }
}
