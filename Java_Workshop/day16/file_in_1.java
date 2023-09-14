package day16;

import java.io.FileInputStream;

public class file_in_1 {
    public static void main(String[] args) {
        try{                                            //path of the file you want to read
            FileInputStream in = new FileInputStream("D:\\CSDS213\\Java\\Java_Workshop\\day16\\file.txt");
            System.out.println(in.available()); //to check is the file you are looking for is available in your current repository.
            System.out.println(in.getChannel());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
