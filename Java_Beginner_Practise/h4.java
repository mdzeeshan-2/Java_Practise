import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        System.out.println("Please Enter First Number");
        Scanner sc1 = new Scanner(System.in);
        int first = sc1.nextInt();
        System.out.println("Please Enter second Number");
        Scanner sc2 = new Scanner(System.in);
        int second = sc2.nextInt();
        int s3 = first + second;
        System.out.println("The Sum of First and Second: " + s3);
        sc1.close();
        sc2.close();
    }
}