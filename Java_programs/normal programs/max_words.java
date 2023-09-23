public class max_words {
    public static void main(String[] args) {
        //String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        //String [] sentences = {"please wait", "continue to fight", "continue to win"};
        String [] sentences = {"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        int max = 0;

        for (String word : sentences){
            int count = 0;

            String words [] = word.split(" ");            
            for (int i = 0; i < words.length; i++) {
                count++;
            }

            if(max < count){
                max = count;
            }
        }

        System.out.println(max);
    }
}
