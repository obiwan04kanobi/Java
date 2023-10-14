package day8;

class Animal{
    void eat_2(){
        System.out.println("Animal is eating...");
    }
}

class dog extends Animal{
    @Override
    void eat_2(){
        System.out.println("Dog is eating...");
    }
}
public class dynamic_binding {
    public static void main(String[] args) {
        Animal a = new dog(); 
        a.eat_2();
    }
}
