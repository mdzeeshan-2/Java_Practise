import java.util.Scanner;
public class h13 {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        // for (int j = 0; j <= 5; j++) {
        //     for (int i = 1; i <= 5; i++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        for(int j = 0; j<=n; j++){
            for (int i = 0; i <= j; i++) {
                System.out.print(" x ");
            }
            System.out.println();
        }
    }
}
