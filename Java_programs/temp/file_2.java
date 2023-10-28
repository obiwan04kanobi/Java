package Java_programs.temp;

import java.io.*;

public class file_2 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fo = new FileOutputStream("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/temp/temp.txt");
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        String text = "The Beatles";
        byte b[] = text.getBytes();
        bo.write(b);
        bo.close();
        fo.close();
    }
}
