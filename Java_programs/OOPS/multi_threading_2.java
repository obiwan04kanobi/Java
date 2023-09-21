
class MyThreadRunnable1 implements Runnable{
    public void run(){
        while (true) {
        System.out.println("I am a Thread 1 not a Threat 1");            
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        while (true) {
        System.out.println("I am a Thread 2 not a Threat 2");            
        }
    }
}

public class multi_threading_2 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();    //bullet without gun is useless, similarly creating an object of MyThreadRunnable1 class without creating a Thread object is useless
        Thread gun1 = new Thread(bullet1); // gun1 is a Thread object. It is a gun which has a bullet named bullet1.s

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2); // gun2 is a Thread object. It is a gun which has a bullet named bullet2. 

        gun1.start(); // start() is a method of Thread class. It calls run() method.
        gun2.start();

    }
}
