public class a14 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 8, 11, 36, 48, 93, 112 };
        int target = 48;
        int result = ans(nums, target);
        System.out.println(result);
    }
    public static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            start = end + 1;
            end = end+(end - start + 1)*2;
            
        }
        return infiniteBinarySearch(nums, target, start, end);
    }

    public static int infiniteBinarySearch(int[] nums, int target, int start, int end) {
        int s = start;
        int e = end;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
