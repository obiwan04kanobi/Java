public class string_reverse {
    public static void main(String[] args) {
        
        String s = "Let's take LeetCode contest";
        String rev1 = "";
        String words [] = s.split(" ");

        for (String word : words){ //for each word in words

            char [] ch = word.toCharArray();
            int len = ch.length;

            for(int i = len-1; i >= 0;i--){
                rev1 += ch[i];
            }
            rev1 += " ";
        }

        System.out.println(rev1); 

    }
}
