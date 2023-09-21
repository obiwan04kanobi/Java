
class MyThread_1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000) {
            System.out.println("Thread 1 for Cooking");
            System.out.println("I am happy !");
            i++;
        }
    }
}

class MyThread_2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000) {
            System.out.println("Thread 2 for Chatting");
            System.out.println("I am Sad !");
            i++;
        }
    }
}

public class multi_threading_1{
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1();
        MyThread_2 t2 = new MyThread_2();
        
        t1.start();
        t2.start();
    }
}