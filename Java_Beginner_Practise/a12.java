public class a12 {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 20, 55, 92 };
        int target = 93;
        int result = linearSearchQ1(nums, target);
        System.out.println(result);
    }

    static int linearSearchQ1(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target==arr[mid]) {
                return arr[mid];
            }
            if (target<arr[mid]) {
                end = mid-1;
            }
            else{
                start = mid + 1; 
            }
        }

        return arr[end+1];
    }
}
