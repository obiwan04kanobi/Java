package day16;

import java.io.FileInputStream;

public class file_in_2 {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("D:\\CSDS213\\Java\\Java_Workshop\\file.txt");
            
            int i = 0;
            
            //using a while loop to print the characters in the file character by character
            while((i = in.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
