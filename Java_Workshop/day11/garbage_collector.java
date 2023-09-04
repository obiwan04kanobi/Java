package day11;

class cricketer{

    cricketer(){

        System.out.println("Object is created");
    }

    protected void finalize(){ // invokes if garbage collector method has run
        System.out.println("object is destroyed");
    }
}


public class garbage_collector {
    public static void main(String[] args) {
        cricketer c = new cricketer();
        c = null; // unreferenced object is created

        cricketer c1 = new cricketer();
        cricketer c2 = new cricketer();

        c1 = c2;

        new cricketer();

        System.gc(); // garbage collector method
    }
}
