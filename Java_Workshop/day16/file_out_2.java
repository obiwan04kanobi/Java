package day16;

import java.io.FileOutputStream;
import java.util.Scanner;

public class file_out_2 {
    public static void main(String[] args) {

        try
        {
            FileOutputStream f = new FileOutputStream("Batch 3.txt");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter a String: ");
            String a = sc.nextLine();
            
            System.out.println("Enter an Integer: ");
            byte b = sc.nextByte();

            byte c[] = a.getBytes();
            
            byte back_space[] = "\n".getBytes();

            f.write(b); // will always print ASCII values of the integers entered
            f.write(back_space);
            f.write(c);

            System.out.println("Success");
            f.close();
            sc.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
