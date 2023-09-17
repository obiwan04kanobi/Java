package day8;

class Parent_2{

    void eat(){
        System.out.println("Team pay attention");
    }
}

class child_2 extends Parent_2{

    @Override
    void eat(){

        super.eat();
        System.out.println("Salman listen in the class");
    }

}

public class super_keyword_1 {
    public static void main(String[] args) {
        child_2 c = new child_2();
        c.eat();
    }
}
