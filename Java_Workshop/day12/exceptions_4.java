package day12;

public class exceptions_4 {
    public static void main(String[] args) {
        String str = null;
        try{
            if(str.equals("Hello")){
                System.out.println("Same");
            }
            else{
                System.out.println("Not Same");
            }
            
        }
        catch(NullPointerException ae){
            System.out.println("Catch block");
            System.out.println(ae.getMessage());
        }
    }   
}
