package day4;
import java.util.Scanner;

public class sum2 {
    
    int num1,num2; // data members (or) Static Variables
    
    //methods for input
    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Num 1: ");
        num1 = sc.nextInt();
        System.out.println("Num 2: ");
        num2 = sc.nextInt();
    }

    public int add(){
        return num1 + num2;
    }

    public static void main(String[] args) {
        
        sum2 op = new sum2();
        op.getdata();
        System.out.println("Addition: "+op.add());
    }
}
