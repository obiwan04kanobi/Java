import java.io.*;

public class io_1 {
    public static void main(String[] args) throws IOException{

        //code to create a new empty file
        File myfile = new File("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/OOPS/temp.txt");
        myfile.createNewFile();

        //code to write to a file
        FileWriter fileWriter = new FileWriter("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/OOPS/temp.txt");
        fileWriter.write("hello, George");
        fileWriter.close();
    }
}
