package day17;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter inputs or outputs data in ASCII or Unicode values

public class file_writer_1 {
    public static void main(String[] args) throws IOException{

        FileWriter fw = new FileWriter("D:\\CSDS213\\Java\\Java_Workshop\\day17\\writer.txt");

        String str = "Khalid\n";

        fw.write("Harry is Learning java\n"); // can directly enter the input here

        for(int i = 0;i<str.length();i++){
            fw.write(str.charAt(i));
        }

        fw.close();
    }
}
