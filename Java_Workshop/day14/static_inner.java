package day14;

public class static_inner {

    //static property
    static int data = 30;

    //static class
    static class Inner_5{

        //non-static method
        void msg(){
            System.out.println("Data is "+data);
        }
    }


    public static void main(String[] args) {

        static_inner.Inner_5 obj = new static_inner.Inner_5();
        obj.msg();
        
    }
}
