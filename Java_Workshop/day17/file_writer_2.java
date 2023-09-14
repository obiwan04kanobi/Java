package day17;

import java.io.*;

public class file_writer_2 {
    public static void main(String[] args) throws IOException{
        Reader rd = new FileReader("D:\\CSDS213\\Java\\Java_Workshop\\day17\\writer.txt");
        int data = rd.read();
        while (data != -1) {
            System.out.println((char)data+" ");
            data = rd.read();

        }
        rd.close();
    }
}
