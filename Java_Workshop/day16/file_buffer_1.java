package day16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_buffer_1 {
    public static void main(String[] args) throws IOException {
        //file output stream is an abstract class for buffered output stream.
        FileOutputStream fout = new FileOutputStream("D:\\CSDS213\\Java\\Java_Workshop\\day16\\buffer.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to Buffer Files Concept";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.close();
        fout.close();
    }
}
