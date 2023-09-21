
/*
 * join() method is used to make the main thread wait for the other thread to finish.
 * In this program, the main thread will wait for t5 to finish and then t6 will run.
 * If we comment the join() method, then the main thread will run first and then t5 and t6 will run.
 * join() method throws InterruptedException.
 * Thread.sleep() method throws InterruptedException.
 *  Thread.sleep() method is used to make the thread sleep for some time.
 */

class Mythread_5 extends Thread{
    public void run(){
        //int i = 0;
        while (true) {
            System.out.println("Hi");
            //i++;

            try {
                Thread.sleep(200); // this will make the thread sleep for 200 milliseconds. 
            } catch (Exception e) {
                e.printStackTrace(); // this will print the error stack trace. 
            }
        }
    }
}

class Mythread_6 extends Thread{
    public void run(){
        //int i = 0;
        while (true) {
            System.out.println("Hello");
            //i++;

            try {
                Thread.sleep(600); // this will make the thread sleep for 600 milliseconds. 
            } catch (Exception e) {
                e.printStackTrace(); // this will print the error stack trace.
            }


        }
    }
}

public class multi_threading_5 {
    public static void main(String[] args) {
        Mythread_5 t5 = new Mythread_5();
        Mythread_6 t6 = new Mythread_6();
        
        t5.start();
/*
         try {
            t5.join(); // this will make the main thread wait for t5 to finish. First t5 will running then after that t6 will run.
        } catch (Exception e) {
            System.out.println(e); 
        } 
*/

        t6.start();
    }
}
