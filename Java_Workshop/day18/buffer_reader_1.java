package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  in this file we are reading an old file and converting the lower case characters to uppercase and uppercase 
 *  characters to lowercase and saving these changes by writing them into a new file. This is also known as 
 *  sequential file stream. 
 */



public class buffer_reader_1{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new FileReader("D:\\CSDS213\\Java\\Java_Workshop\\day17\\writer.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\CSDS213\\Java\\Java_Workshop\\day18\\buffer_reader.txt"));
        
        int i;
        do {
            i = br.read();
            if(i != -1){ // -1 when we reach the end of the file

                if(Character.isLowerCase((char)i)){
                    bw.write(Character.toUpperCase((char)i));
                }
                else if(Character.isUpperCase((char)i)){
                    bw.write(Character.toLowerCase((char)i));
                }
                else{
                    bw.write((char)i);
                }               
            }

        } while (i != -1);

        br.close();
        bw.close();
    }
}