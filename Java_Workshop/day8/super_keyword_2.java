package day8;

class Parent_3{

    void eat_1(){
        System.out.println("Team pay attention !!!");
    }
}

class Child_3 extends Parent_3{

    Child_3(){

        super();
        System.out.println("Salman listen in the class");
    }

}

public class super_keyword_2{
    
    public static void main(String[] args) {
            Child_3 c = new Child_3();
            c.eat_1();
    }

}