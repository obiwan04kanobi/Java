package day3;
import java.util.Scanner;

public class print {
    String name;

    public void diplay(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        print p = new print();
        p.diplay();
    }
}
