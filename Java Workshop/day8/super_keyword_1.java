package day8;

class Parent{

    void eat(){
        System.out.println("Team pay attention");
    }
}

class child extends Parent{

    void eat(){

        super.eat();
        System.out.println("Salman listen in the class");
    }

}

public class super_keyword_1 {
    public static void main(String[] args) {
        child c = new child();
        c.eat();
    }
}
