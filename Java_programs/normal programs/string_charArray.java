public class string_charArray {
    public static void main(String[] args) {
        String beatle_1 = new String("George Harrison");
        String beatle_2 = new String("Richard Starkley");
        String beates = new String("THE BEATLES");
        float help = 1965.0f;

        //converts String to character Array
        char [] ch = beatle_1.toCharArray();
        System.out.println(ch[4]);

        System.out.println(beatle_1.charAt(7));
        System.out.println(String.valueOf(help)+1969);
        System.out.println(beates.toLowerCase());
        System.out.println(beatle_1.concat(beatle_2));

    }
}
