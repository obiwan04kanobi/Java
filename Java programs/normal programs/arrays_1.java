import java.util.Scanner;

// PROGRAM TO CALCULATE OVERALL PERCENTAGE BY ASKING NO.OF SUBJECTS AND USING ARRAYS TO STORE MARKS

public class arrays_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        System.out.println("Enter no. of subjects: ");        
        int n = sc.nextInt();

        float [] marks = new float[n];

        for(int i=0;i<n;i++){
            
            System.out.println("Enter Marks of Subject "+(i+1));
            marks[i] = sc.nextFloat();
        }

        float sum = 0;

        for(int i=0;i<n;i++){
            sum += marks[i];
        }

        float avg = sum/5;
        System.out.println("Average of "+n+" Subjects is: "+avg+"%");
    }
}
