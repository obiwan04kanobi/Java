
/*
 * This program is used to demonstrate the use of priority in threads.
 * The priority of a thread is an integer value that specifies the priority of a thread.
 * The priority of a thread can be set using the setPriority() method.
 * The priority of a thread can be obtained using the getPriority() method.
 */

class Mythread_4 extends Thread{
    public Mythread_4(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am "+this.getName()); // this.getName() is used to get the name of the thread.
            i++;
        }
    }
}

public class multi_threading_4 {
    public static void main(String[] args) {
        System.out.println("THE FAB FOUR");
        Mythread_4 b1 = new Mythread_4("1. John Lennon");
        Mythread_4 b2 = new Mythread_4("2. Paul McCartney");
        Mythread_4 b3 = new Mythread_4("3. George Harrison");
        Mythread_4 b4 = new Mythread_4("4. Ringo Starr");
        Mythread_4 b5 = new Mythread_4("5. Sir George Martin (most important)");

        b5.setPriority(Thread.MAX_PRIORITY); // Set priority to the most important thread.     
        b1.setPriority(Thread.MIN_PRIORITY); // Set priority to the least important thread.
        b2.setPriority(Thread.MIN_PRIORITY);
        b3.setPriority(Thread.MIN_PRIORITY);
        b4.setPriority(Thread.MIN_PRIORITY);

        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
    }
}
