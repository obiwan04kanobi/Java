public class method_overloading_1 {

    // Method overloading only and only possible by changing arguments/parameters not by changing its access specifiers
    static void foo(){
        System.out.println("Hello, World !");
    }

    static void foo(String name){

        System.out.printf("Hello, %s",name);

    }

    public static void main(String[] args) {
        
        String name = "Mayank";

        foo();
        foo(name);

    }
}
