package day20;

public class dead_lock_1 {
    String s1 = "Nitish";
    String s2 = "Piyush Gupta";
    Thread t1 = new Thread(){
        public void run(){
            while(true){
                synchronized(s1){
                    try {
                        System.out.println("Hi Nitish");
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(s2){
                        System.out.println(Thread.currentThread().getName() + " locked "+s2);
                    }
                }
            }
        }
    };

    Thread t2 = new Thread(){
        public void run(){
            while(true){
                synchronized(s2){

                System.out.println("Hi Piyush Gupta");
                }
                synchronized(s1){
                    System.out.println(Thread.currentThread().getName() + " locked "+s1);
                }
            }
        }
    };

    public static void main(String[] args) {
        dead_lock_1 obj = new dead_lock_1();
        obj.t1.start();
        obj.t2.start();
    }

}
