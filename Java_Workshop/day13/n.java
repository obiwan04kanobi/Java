package day13;

import java.util.Scanner;

// ENTER "N" NUMBERS AS COMMAND LINE ARGUMENTS AND PRINT THEM WITH ALTERNATIVE SIGNS, LIKE +1 -2 +3 -4 .....

public class n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = args.length;

        int [] arr = new int[size];

        for (int i =0;i<size;i++){
            arr[i] = Integer.parseInt(args[i]);
        }

        for (int i = 2; i <=(size+2);i++){
            
            if (i % 2 == 0){
                System.out.printf("+%d\n",args[i-2]);
            }
            else{
                System.out.printf("-%d\n",args[i-2]);
            }
        }
    }
}
