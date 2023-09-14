package day17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class print_stream_1 {
    public static void main(String[] args) throws IOException {

        // FileOutputStream acts as an abstract class for PrintStream 
        FileOutputStream fout = new FileOutputStream("D:\\CSDS213\\Java\\Java_Workshop\\day17\\print.txt");     
        PrintStream ps = new PrintStream(fout);

        ps.println("Paul McCartneyy");
        ps.println("Flaming Pie");
        ps.println(2020);

        ps.close();
        fout.close();   
    }
}
