package day17;

import java.io.IOException;
import java.io.PrintWriter;

public class print_writer_1 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("D:\\CSDS213\\Java\\Java_Workshop\\day17\\rajan.txt");
        char c = 'A';
        pw.println(c);
        pw.println("Hello, Rajan");
        pw.print("Nupur what are you doing");
        pw.close();
    }
}
