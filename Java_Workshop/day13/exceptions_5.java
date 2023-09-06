package day13;

public class exceptions_5 {

    public static void check(int num){
        
        try{

        if (num<18){
            throw new ArithmeticException("Not eligible");
        }
        else{
            System.out.println("Eligible to vote");
        }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public static void main(String[] args) {
        check(10);

    }
}
