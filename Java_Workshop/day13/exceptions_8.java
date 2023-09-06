package day13;

import java.io.IOException;

//throws keyword is used in "checked" exceptions. For "un-checked" exceptions we need to use try-catch.

class Test{

    void method()  throws IOException
    {
        System.out.println("Device is working");
    }
}

public class exceptions_8 {
    public static void main(String[] args) throws IOException { //for catching the IOException we need to also write throws IOException in the main method
        Test m = new Test();
        m.method();
        System.out.println("The Normal Flow");
    }
}
