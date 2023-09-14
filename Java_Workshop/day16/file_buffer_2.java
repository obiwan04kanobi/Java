package day16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class file_buffer_2 {
    public static void main(String[] args) throws IOException{
        try{        
            FileInputStream fin = new FileInputStream("D:\\CSDS213\\Java\\Java_Workshop\\day16\\buffer.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;
            while((i = bin.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
