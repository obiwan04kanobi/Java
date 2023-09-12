package day15;

@FunctionalInterface
interface See{
    
    abstract void csds();
}

public class anonymous_inner_3 {
    public static void main(String[] args) {
        
        See A = new See()
        {
            public void csds(){
                System.out.println("Hi team");
            }
        };
        A.csds();
        
    }
}
