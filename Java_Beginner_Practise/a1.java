public class a1 {
    public static void main(String[] args) {
        int[] result = new int[4];
        // int[] result - It is the decalaration of an Array, result is defined in stack - This happens in COMPILETIME
        // new int[4]; - This is initialization of an Array, here at this point Object is created in heap memory - This happens in RUNTIME (Dynamic Memory Allocation)
        int n = 2;
        for (int i = 0; i < result.length; i++) {
            result[i] = n;
            n++;
            System.out.println(result[i]);
        }
      
    }
}