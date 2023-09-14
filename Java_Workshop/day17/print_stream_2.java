package day17;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class print_stream_2 {
    public static void main(String[] args) throws IOException{
        
        byte[] array = {1,2,3,4};
        ByteArrayInputStream bin = new ByteArrayInputStream(array);
        
        System.out.println("Elements indide array are: ");

        for(int i = 0; i<array.length;i++){
            int data = bin.read();
            System.out.println(data+" ");
        }
        bin.close();
    }
}
