import java.util.Scanner;
public class h9 {
    public static void main(String[] args) {
        System.out.println("Enter the Number for table");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i = 1; i<=10; i++){
        //     int m = n*i;
        //     System.out.println(n+ "x" +i +"=" +m);
        // }
        int m=0;
        for(int i = 1; i<=n; i++){
            m = m + 2*i; 
        }
        System.out.println(m);
    }
}
