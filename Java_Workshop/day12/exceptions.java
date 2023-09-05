package day12;

public class exceptions {
    public static void main(String[] args) {

        try{
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }

        //no statement/code can come in b/w the try-catch block
        catch(ArithmeticException ae){
            System.out.println("Exception caught");
            System.out.println(ae.getMessage()); //displays what error was occured if any error has occured otherwise if no error it will simply display the result
        }
    }
}
