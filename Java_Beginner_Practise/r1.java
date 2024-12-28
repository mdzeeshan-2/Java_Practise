import java.util.Scanner;

public class r1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxi = 0;
        maxi = a > b ? a : b;
        System.out.println(maxi);
        sc.close();
    }
}
