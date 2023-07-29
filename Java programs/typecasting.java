/*
 * Problem was that you have to write a java code 
 * that encryptes the actual grade (in alphabets)
 * by adding integer 8 to it and decrypt it later
 * to show the actual grade.
 */

public class typecasting {
    public static void main(String[] args) {
        
        char ac_grade = 'B';
        ac_grade = (char) (ac_grade + 8);   // using typecasting here because otherwise the addition of a char and an int would result in an integer value.
        System.out.println("Encrypted Grade:");
        System.out.println(ac_grade);

        char de_grade = (char)(ac_grade - 8);
        System.out.println("Decrypted Grade:");
        System.out.println(de_grade);
    }
}
