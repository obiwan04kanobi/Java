public class binary_search{
    public static void main(String[] args) {
        int nums [] = {-1,0,3,5,9,12};
        int target = 2;
        int n = nums.length; // length of array
        int mid = n/2;
        int index = -1;

        if (target == nums[mid]){
            index = mid;
            System.out.println(index);
        }
        else if(n == 1){
            index = 0;
            System.out.println(index);
        }
        else if (target < nums[mid]){
            for (int i = 0; i <= mid-1; i++) {
                if (target == nums[i]){
                    index = i;
                    System.out.println(index);
                }
            }
        }
        else if (target > nums[mid]){
            for (int j = mid+1; j <= n-1; j++) {
                if (target == nums[j]){
                    index = j;
                    System.out.println(index);
                }
            }
        }
        else{
            System.out.println(index);
        }


    }
}