//constructors of Thread class
class Mythread_3 extends Thread{
    public Mythread_3(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a Thread");
            i++;
        }
    }
}


public class multi_threading_3 {
    public static void main(String[] args) {
        Mythread_3 t1 = new Mythread_3("Paul");
        Mythread_3 t2 = new Mythread_3("George");
        
        t1.start();
        t2.start();
        
        //methods of Thread class
        
        System.out.println("The ID of Thread t1 is: "+t1.threadId());
        System.out.println("The Name of Thead t1 is: "+t1.getName());

        System.out.println("The ID of Thread t2 is: "+t2.threadId());
        System.out.println("The Name of Thead t2 is: "+t2.getName());
        
    }
}
