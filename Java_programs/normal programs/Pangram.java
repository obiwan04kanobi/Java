public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        
        // Create a boolean array to mark the presence of each letter
        boolean[] alphabet = new boolean[26];
        
        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // If the character is a lowercase letter, mark it as present
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        
        // Check if all letters have been marked as present
        for (boolean present : alphabet) {
            if (!present) {
                System.out.println(true);;
            }
        }
        
        System.out.println(false);
    }
}
