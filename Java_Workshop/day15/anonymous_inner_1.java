package day15;

class B2{

    void disp_2(){
        System.out.println("We are great students of Niet");
    }
}

public class anonymous_inner_1 {
    public static void main(String[] args) {
        
        B2 obj = new B2()
        {   
            //Anonymous class used because instead of overriding a method by creating a seperate class and wasting memory we are not declaring a class
            void disp_2()
            {
                System.out.println("NIET");     //ANONYMOUS INNER CLASS
            }         
        };
        obj.disp_2();

    }
}
