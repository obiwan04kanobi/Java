
class Practice_1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class Practice_2 extends Thread{
    public void run(){
        while (true) {
/*             try {
                System.out.println("Welcome");
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
*/
            System.out.println("Welcome");            
        }
    }
}

public class Pset_Threads {
    public static void main(String[] args) {
        Practice_1 p1 = new Practice_1();
        Practice_2 p2 = new Practice_2();

        //p1.setPriority(Thread.MAX_PRIORITY); // will be seen more often in output
        //p2.setPriority(Thread.MIN_PRIORITY); // will be seen less often in output

/* 
        //Un-comment these lines after commenting p1.start() & p2.start() to see the default priority for each thread
        //Un-comment these lines after commenting p1.start() & p2.start() and Un-commenting p1.setPriority() & p2.setPriority() to see the priorities given to each thread by the programmer
        
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority()); 
*/
/* 
        System.out.println(p1.getState()); // tells the state of the thread.
        System.out.println(Thread.currentThread().getState()); // tells state of the current thread. In this case, we are refrerring to the current Thread.
*/   
        p1.start();
        p2.start();
    }
}
