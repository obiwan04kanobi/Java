package day12;

public class exceptions_3 {
    public static void main(String[] args) {
        int n = 26;
        try{
            System.out.println("In try block");
            int z = n/0;
            System.out.println(z);
        }
        catch(Exception ae){
            System.out.println("Catch block");
            System.out.println(ae.getMessage());
        }
        finally{
            //finally block will get executed no matter if the code runs or encounters an error 
            System.out.println("Finally block");
        }
    }
}
