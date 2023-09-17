import java.io.*;
import java.util.Scanner;

public class io_1 {
    public static void main(String[] args) throws IOException,FileNotFoundException{

        //code to create a new empty file
        File myfile = new File("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/OOPS/temp.txt");
        myfile.createNewFile();

        //code to write to a file
        FileWriter fileWriter = new FileWriter("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/OOPS/temp.txt");
        fileWriter.write("hello, George\nbye, George");
        fileWriter.close();

        //code to read a file
        File mFile = new File("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/OOPS/temp.txt");
        Scanner sc = new Scanner(mFile);
        while(sc.hasNextLine()){
           String line = sc.nextLine();
           System.out.println(line); 
        }
        sc.close();
/* 
        //code to delete a file
        File mFile2 = new File("/Users/mayankpant/Documents/code/GitHub Projects/Java/Java_programs/OOPS/temp.txt");
        if(mFile2.delete()){
            System.out.println("I have deleted: "+mFile2.getName());
        }
        else{
            System.out.println("Some problem occured while deleting the file");
        }
 */
    }
}
