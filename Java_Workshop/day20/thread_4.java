package day20;
/*
 * Using lambda function (used for optimising the code)
 */
public class thread_4 {
    public static void main(String[] args) {
        Runnable obj1 = ()->{
                for(int i = 1;i<=5;i++){
                    System.out.println("Hi");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        //to handle exceptions
                    }
                }
            };
        Runnable obj2 = ()->{
                for(int i = 1;i<=5;i++){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        //to handle exceptions
                    }
                }
            };

            Thread t1 = new Thread(obj1);
            t1.start();
            Thread t2 = new Thread(obj2);
            t2.start();
    }
}
