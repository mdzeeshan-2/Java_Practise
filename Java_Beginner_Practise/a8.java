import java.util.Arrays;

public class a8 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 1};
        int[][] twoD = {{2,5,2,6},
                        {89,2,34,70},
                        {98,2,7,5,6}};
        // System.out.println(linearSearchMinimum(arr));
        // System.out.println(linearSearchMaximum(arr));
        int[] ans = linearSearchTwoD(twoD, 70);
        System.out.println(Arrays.toString(ans));
    }
    static int linearSearchMinimum(int[] nums){
        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (small>nums[i]) {
                small = nums[i];
            }
        }
        return small;
    }
    static int linearSearchMaximum(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max<nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
    
    static int[] linearSearchTwoD(int[][] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (target==nums[i][j]) {
                    return new int[]{i,j};
                    // System.out.println("Found it");
                }
            }
        }
        return new int[]{-1,-1};
    }
}
     
                                                                                