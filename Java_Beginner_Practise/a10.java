public class a10 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 35, 45, 60};
        int target = 0;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1; 
        
        while (start <= end) {
            int mid = start + (end - start) / 2; 

            if (target == arr[mid]) {
                return mid; 
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
