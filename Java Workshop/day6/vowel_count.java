import java.util.Scanner;

public class vowel_count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");

        String usr_input = sc.nextLine();

        char [] ch = usr_input.toCharArray();

        int vowel = 0;
        int consonant = 0;

        for (int i=0;i<usr_input.length();i++){

            if (ch[i] == 'a'|| ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' 
            || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U'){

                vowel++;

            }
            
            else if (ch[i] == ' '){
                continue;
            }

            else{
                consonant++;
            }

        }
        System.out.printf("No. of vowels is: %d and consonants is: %d",vowel,consonant);


    }
}