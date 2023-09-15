import java.util.Scanner;

public class practice_ch5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*      
        // Ques. 1

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            System.out.println("*".repeat(n-i));
        }
*/

/* 
        // Ques. 2

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 0;
        while (i <= n){

            if (i%2==0){
                //System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of first "+n+" even numbers is "+ sum);


*/


/* 
        //Ques 3.

        System.out.println("Enter N: ");

        int n = sc.nextInt();
        int mul = n;
        for(int i = 1;i<11;i++){

            System.out.println(n+" x "+i+" = "+ mul );
            mul = (i+1) * n;
        }

*/

/* 
        // Ques. 4

        System.out.println("Enter N: ");

        int n = sc.nextInt();
        int mul = n*10;
        for(int i = 10;i >= 1;i--){

            System.out.println(n+" x "+i+" = "+ mul );
            mul = (i-1) * n;
        }

*/

/* 
        //Ques 5.
        System.out.println("Enter N:");
        int n = sc.nextInt();

        int fact = 1;

        for (int i =1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

*/
        sc.close();
    }    

}
