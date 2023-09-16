
//create a sample interface
interface MyInterface{
    void meth1();
    void meth2();
}


/* class Myclass implements MyInterface{

    @Override
    public void meth1(){
        System.out.println("meth1");
    }
    @Override
    public void meth2(){
        System.out.println("meth2");
    }
} */


public class anonymous_class_1 {
    public static void main(String[] args) {
/*         Myclass obj = new Myclass();
        obj.meth1(); */

        // Anonymous class

        /*
         * Anonymous classes enable you to make your code more concise. 
         * They enable you to declare and instantiate a class at the same time. 
         * They are like local classes except that they do not have a name. 
         * Use them if you need to use a local class only once.
         */
        MyInterface obj = new MyInterface(){
            @Override
            public void meth1(){
                System.out.println("meth1");
            }
            @Override
            public void meth2(){
                System.out.println("meth2");
            }
            
/*             public void meth3(){             // error because interface does not have meth3
                System.out.println("meth3");
            } */
        };

        obj.meth1();
        obj.meth2();
        //obj.meth3(); // error


    }
}
