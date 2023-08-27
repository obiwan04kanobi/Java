
public class while_loops1{
    public static void main(String[] args) {
        int a = 0;
/*
 * The big difference b/w "while loop" and "do-while loop" in java is that 
 * in "while loop" the condition is first checked then the block of code
 * inside it is executed while in "do-while loop" first the block of code is 
 * executed and then the condition is checked.
 */
        while(a<5){
            System.out.println("Inside while loop!!");
            a++;
        }

        int b = 10;

        do{
            System.out.println(b);
        }while(b<5);
    }
}