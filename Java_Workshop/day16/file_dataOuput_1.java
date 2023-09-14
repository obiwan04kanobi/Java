package day16;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_dataOuput_1 {
    public static void main(String[] args) throws IOException{
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\CSDS213\\Java\\Java_Workshop\\day16\\data_output.txt"));
        dout.writeInt(10);
        dout.writeChar('a');
        dout.writeDouble(10.2);
        dout.close();
    }
}
