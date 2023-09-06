package day13;

class Niet{
    void div (int a ,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
}

public class exceptions_9 {
    public static void main(String[] args){
        Niet s = new Niet();
        try{
            s.div(20,0);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
}
