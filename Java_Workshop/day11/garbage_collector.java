package day11;

class cricketer{

    cricketer(){

        System.out.println("Object is created");
    }

    // finalize is executed just before garbage collector deletes the unused objects
    protected void finalize(){ // invokes if garbage collector method has run
        System.out.println("object is destroyed");
    }
}


public class garbage_collector {
    public static void main(String[] args) {
        cricketer c = new cricketer(); //obj created
        c = null; // unreferenced object  

        cricketer c1 = new cricketer(); // obj created
        cricketer c2 = new cricketer(); // obj created

        c1 = c2; // unreferenced object

        new cricketer(); // obj created //anonymous object

        System.gc(); // garbage collector method
        //garbage collector destroys unreferenced objects & anonymous object
    }
}
