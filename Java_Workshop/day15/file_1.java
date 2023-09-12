package day15;

import java.io.FileWriter;
import java.io.IOException;

public class file_1 {
    public static void main(String[] args) throws IOException 
    {   
        //creates a file in folder directory
        FileWriter fw = new FileWriter("Basic.txt");
        fw.close();
    }
}
