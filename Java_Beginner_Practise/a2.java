import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     // System.out.println("Enter the elements of the Array");
        //     int elements = sc.nextInt();
        //     arr[i]=elements;
        // } 
        // System.out.println("Here is the full Array");
        // for (int j : arr) {
        //     System.out.println(j+ " ");
        // }   
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
