package day20;

/*
 * Using anonymous class
 */

public class thread_3 {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i = 1;i<=10;i++){
                    System.out.println("Welcome to Niet");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        //to handle exceptions
                    }
                }
            }
        };
        Runnable obj2 = new Runnable(){
            public void run(){
                for(int i = 1;i<=10;i++){
                    System.out.println("You made a mistake 🥰");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        //to handle exceptions
                    }
                }
            }
        };

        Thread t1 = new Thread(obj1);
        t1.start();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
