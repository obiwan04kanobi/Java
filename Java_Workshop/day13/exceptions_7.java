package day13;

public class exceptions_7 {
    public static void main(String[] args) {
        
        try{
            for(int i = 1;i<= 10;i++){
                System.out.println(i);
                if (i == 4){
                    throw new ArithmeticException("5 not Allowed !!");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}
