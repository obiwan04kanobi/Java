package day8;

class Parent{

    void eat_1(){
        System.out.println("Team pay attention !!!");
    }
}

class Child extends Parent{

    Child(){

        super();
        System.out.println("Salman listen in the class");
    }

}

public class super_keyword_2{
    
    public static void main(String[] args) {
            Child c = new Child();
            c.eat_1();
    }

}