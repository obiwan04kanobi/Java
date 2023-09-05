package day12;

public class exceptions_2 {
    public static void main(String[] args) {

        try{
            int number[] = new int[10];
            number[12] = 30/10;
        }

        catch(Exception ae){ //instead of everytime specifing which exception type it is we can simply write "Exception" keyword to catch whatever exception occurs automatically 
            System.out.println(ae.getMessage());
        }        
    }
}
