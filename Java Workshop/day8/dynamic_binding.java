package day8;

public class dynamic_binding {
    
    class Animal{

        void eat(){
            System.out.println("Animal is eating...");

        }
    }
        class dog extends Animal{

            void eat(){

                System.out.println("Dog is eating...");
            }

            public static void main(String[] args) {
                
            Animal a = new dog(); 
            a.eat();

        }

    }

}
