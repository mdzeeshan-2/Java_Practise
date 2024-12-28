public class a11 {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 20, 55, 92 };
        int[] numsD = { 92, 55, 20, 6, 4, 2 };
        int target = 4;
        int result = OrganicBinarySearch(numsD, target);
        System.out.println(result);
    }

    static int OrganicBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        if (isAsc == true) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            if (isAsc == false) {
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (arr[mid] == target) {
                        return mid;
                    }
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        return -1;
    }
}
