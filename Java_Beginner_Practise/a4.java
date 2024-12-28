import java.util.Scanner;

public class a4 {
    public static void swap(int[] num, int f, int l) {
        int temp = num[f];
        num[f] = num[l];
        num[l] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Enter the First Element to swap");
        int firstEl = sc.nextInt();
        System.out.println("Enter the Second Element to swap");
        int secondEl = sc.nextInt();
        System.out.println("Array after Swapping");
        swap(nums, firstEl, secondEl);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < nums.length / 2; i++) {
            swap(nums, i, nums.length - 1 - i);
        }
        System.out.println("Array after Reversing");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
