package Java_programs.temp;

import java.io.*;

public class file_3 {
    public static void main(String[] args) throws IOException{
        try{
            FileInputStream fin = new FileInputStream("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/temp/temp.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;
            while ((i = bin.read()) != -1) {
                System.out.println((char)i);
            }
            fin.close();
            bin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
