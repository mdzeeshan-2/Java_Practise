public class a5 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;
        int n = nums.length;
        int min = nums[0];
        for(int i =0 ; i<n; i++){
           if(min>nums[i]){
               min = nums[i];
           }
           
        }   
      System.out.println(nums);
    }
}