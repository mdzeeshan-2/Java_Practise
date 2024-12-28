import java.util.Scanner;
public class h18 {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to average for: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greet();
        avg(a, b);
    }

    public static void greet() {
        System.out.println("Namaste Dosto");
    }
    public static void avg(int a, int b){
        int c = (a+b)/2;
        System.out.println(c);
    }
}
