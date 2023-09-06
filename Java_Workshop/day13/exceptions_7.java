package day13;

public class exceptions_7 {
    public static void main(String[] args) {
        

        for(int i = 1;i<= 10;i++){
            try{
                if (i == 5){
                    throw new ArithmeticException("5 not Allowed !!");
                }
                else{
                    System.out.printf("The number is: %d\n",i);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }   
}
