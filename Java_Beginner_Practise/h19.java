import java.util.Scanner;

public class h19 {
    public static void main(String[] args) {
        System.out.println("Enter the Number for Math Operations: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Math(a, b);
    }

    public static void Math(int a, int b) {
        int c = Math.min(a, b);
        int d = Math.max(a, b);
        double e = Math.pow(a, b);
        System.out.println(e);

    }
}
