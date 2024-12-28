import java.lang.reflect.Array;
import java.util.Arrays;

public class a7 {
    public static void main(String[] args) {
       int[] arr={12,42,52,83,19};
       String str = "Kunal";
       char targetn = 'a';
    //    int result = linearSearch(arr, 83); 
    //    System.out.println(result);
    // System.out.println(Arrays.toString(str.toCharArray()));
    // System.out.println(linearSearch2(str, targetn));
        System.out.println(linearSearch3(arr, 52, 2, 4));
    }
    static int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(target ==  nums[i]){
                return i;
            }

        }
        return -1;
    }
    static boolean linearSearch1(String line, char target){
        if(line.length()==0){
            return false;
        }
        for (int i = 0; i < line.length(); i++) {
            if(target==line.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean linearSearch2(String line, char target){
        if(line.length()==0){
            return false;
        }
        for (char ch : line.toCharArray()) {
            if(target==ch){
                return true;
            }
        }
        return false;
    }
    static int linearSearch3(int[] numss, int target, int start, int end){
        for (int i = start; i < end; i++) {
            if(target == numss[i]){
                return i;
            }
        }
        return -1;
    }
}
