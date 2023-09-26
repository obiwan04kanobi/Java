/*
 * Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
 * Example 1
 * Input: s = "bcabc" Output: "abc" 
 * Example 2:
 * Input: s = "cbacdcbc" Output: "acdb"
 */
import java.util.Scanner;
public class remove_duplicate_letters {
    static String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        char[] ch = s.toCharArray();
        for (char c : ch) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            count[c - 'a']--;
            if (visited[c - 'a']) {
                continue;
            }
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            visited[c - 'a'] = true;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("String after removing duplicate letters: " + removeDuplicateLetters(s));
        sc.close();
    }
}

