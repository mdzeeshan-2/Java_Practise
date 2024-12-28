import java.util.Scanner;
public class h7 {
    public static void main(String[] args) {
        System.out.println("Enter the desired number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // if(number == 7? System.out.println("Thala for a reason") : System.out.println("Why not Thala 7?"));
        String message = (number == 7) ? "Thala for a reason" : "Why not Thala 7?";
        System.out.println(message); 
        sc.close();
    }
}
