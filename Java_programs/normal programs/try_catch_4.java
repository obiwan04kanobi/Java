import java.util.Scanner;

// overriding toString() and getMessage() methods of Exception class using MyException class
class MyException extends Exception{

    @Override
    public String toString(){   // toString() is an in-built method in Java that returns the value given to it in string format. Hence, any object that this method is applied on, will then be returned as a string object.
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

public class try_catch_4 {
    public static void main(String[] args) {        
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        sc.close();
        if(a<99){
            try
            {
                throw new MyException();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); //not an error, just a method to print which error has occured in which line
            }
        }

    }
}
