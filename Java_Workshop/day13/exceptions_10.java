package day13;

class Niet_2{
    void div (int a ,int b) throws ArithmeticException,NullPointerException{
        if (b==0){
            throw new ArithmeticException();
        }
        else{
            throw new NullPointerException();
        }
    }
}

public class exceptions_10 {
    public static void main(String[] args){
        Niet_2 s = new Niet_2();
        try{
            s.div(20,0);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
}
