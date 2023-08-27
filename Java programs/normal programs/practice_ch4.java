import java.util.Scanner;

public class practice_ch4 {
    public static void main(String[] args) {
        //Question 2
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks in each subject out of 100");
        System.out.println("Subject 1 Marks: ");
        byte s1 = sc.nextByte();
        System.out.println("Subject 2 Marks: ");
        byte s2 = sc.nextByte();
        System.out.println("Subject 3 Marks: ");
        byte s3 = sc.nextByte();

        float total = (s1 + s2 + s3)/3.0f;

        if (total >= 40 & s1 >= 33 & s2 >= 33 & s3 >= 33){            
            System.out.println("PASS with "+ total+"%");
        }
        else{
            System.out.println("FAIL with "+ total+"%");
        }
    }
}
