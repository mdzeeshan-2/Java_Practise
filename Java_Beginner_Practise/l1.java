public class l1 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 6};
        int[][] queries = {{0, 2}, {2, 3}};

        boolean[] results = new boolean[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            int countEven = 0;
            int countOdd = 0;

            for (int i = start; i <= end; i++) {
                if (nums[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }

            results[q] = !(countEven >= 2 || countOdd >= 2);
        }

        
        System.out.print("[");
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
            if (i < results.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}