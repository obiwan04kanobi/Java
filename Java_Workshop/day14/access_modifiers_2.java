package day14;

class Outer{
    private int num = 268;
    
    class Inner{
        
        public int getNum(){
            System.out.println("Inside Inner Class");
            return num;
        }
    }
}

public class access_modifiers_2 {
    public static void main(String[] args) {
        
        Outer od = new Outer();
        Outer.Inner in = od.new Inner();
        System.out.println(in.getNum());

    }
}
