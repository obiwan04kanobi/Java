public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        char [] ch = sentence.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            sum += (int)ch[i];
        }

        if (sum >= 2847) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
