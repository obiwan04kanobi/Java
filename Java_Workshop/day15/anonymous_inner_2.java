package day15;

abstract class See{
    
    abstract void csds();
}

public class anonymous_inner_2 {
    public static void main(String[] args) {
        See A = new See() 
        {
            void csds(){
                System.out.println("Hello CSDS");
            }
        };
        A.csds();        
    }
}
