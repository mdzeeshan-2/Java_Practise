import java.util.Arrays;

public class a13 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1 };
        int target = 3;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // System.out.print(" " +nums[i]); 
            nums[i] = nums[i]*-1;
            System.out.println(nums[i]);
            for (int j = 1; j < nums.length; j++) {
                nums[j] = nums[j]*-1;
                System.out.print(" " +nums[i]); 
            } 
            System.out.println(); 
        }
    }
}