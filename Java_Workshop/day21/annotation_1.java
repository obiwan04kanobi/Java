package day21;

// run this program in powershell using "javac filename.java" to get the deprecated warning


class A{
    void msg(){
        System.out.println("Hello");
    }

    @Deprecated
    void display(){
        System.out.println("Welcome");
    }
}

public class annotation_1{
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
        obj.display();
    }
}