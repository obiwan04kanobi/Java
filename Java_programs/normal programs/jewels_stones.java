public class jewels_stones {
    public static void main(String[] args) {
        
        String jewels = "aA",stones = "aAAbbbb";
        
        char [] jewels_array = jewels.toCharArray();
        char [] stones_array = stones.toCharArray();

        int count = 0;

        for (int i = 0; i < jewels_array.length; i++) {

            for(char stone : stones_array){
                if(jewels_array[i] == stone){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
