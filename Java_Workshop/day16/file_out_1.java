package day16;

import java.io.FileOutputStream;

public class file_out_1{
    public static void main(String[] args) {

        try
        {
            FileOutputStream f = new FileOutputStream("Batch 2.txt");
            String a = "\nWelcome to Java File Stream";
            byte b[] = a.getBytes(); 

            f.write(69); // will always print ASCII values
            f.write(b);

            System.out.println("Success");
            f.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}