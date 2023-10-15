package day20;
/*
 * Using lambda function (used for optimising the code)
 */
public class thread_4 {
    public static void main(String[] args) {
        Runnable obj1 = ()->{
                for(int i = 1;i<=10;i++){
                    System.out.println("NIET");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        //to handle exceptions
                    }
                }
            };
        Runnable obj2 = ()->{
                for(int i = 1;i<=10;i++){
                    System.out.println("waste of time");
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

            //some more methods of threads

/*             t1.setPriority(2); //sets the priority of a thread
            t2.setPriority(6);  */
    
            System.out.println(t1.getPriority()); //returns the priority of a thread
            System.out.println(t2.getPriority());
            
            t1.setName("Thread 1"); //changes the name of the thead
            t2.setName("Thread 2");
            
            System.out.println(t1.getName()); //gets the name of the thread
            System.out.println(t2.getName());
            
            System.out.println(t1.getId()); //returns ID of thread
            System.out.println(t2.getId());

            System.out.println(t1.getState()); //returns the state of the thread
            System.out.println(t2.getState());

            System.out.println(); //for one-line space            
    }
}
