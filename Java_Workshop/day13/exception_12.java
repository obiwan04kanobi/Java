package day13;
/* 
 * write a java code to raise exception if the number is equal to zero, if any other number than print square.
 */

import java.util.Random;

class exception_1{
    void random(int random_int) throws NullPointerException{
        if(random_int == 0){
            throw new NullPointerException("😂😂");
        }
        else{
            System.out.println(random_int*random_int);
        }
    }
}

public class exception_12 {
    public static void main(String[] args) {

        exception_1 exp = new exception_1();

        Random rd = new Random();
        try {
            
            int round = 0;
            while (round < 10) {
                int random_int = rd.nextInt(11);
                exp.random(random_int);
                round++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
