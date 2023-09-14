package day16;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_dataOuput_1 {
    public static void main(String[] args) throws IOException{

        //DataOutputStream encrypts the content of the file when it outputs it except string and characters, they are printed as it is  

        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\CSDS213\\Java\\Java_Workshop\\day16\\data_output.txt"));
        dout.writeInt(10);
        dout.writeChar('a');
        dout.writeDouble(10.2);
        dout.close();
    }
}
