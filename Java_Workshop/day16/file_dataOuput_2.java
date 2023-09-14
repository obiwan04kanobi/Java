package day16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class file_dataOuput_2 {
    public static void main(String[] args) throws IOException{
        DataInputStream din = new DataInputStream(new FileInputStream("D:\\CSDS213\\Java\\Java_Workshop\\day16\\data_output.txt"));
        int a = din.readInt();
        char ch = din.readChar();
        double d = din.readDouble();
        System.out.println(a+" "+ch+" "+d);
        din.close();
    }
}
