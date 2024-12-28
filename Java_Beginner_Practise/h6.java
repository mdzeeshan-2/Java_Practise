import java.util.Scanner;

public class h6 {
    public static void main(String[] args) {
        System.out.println("Enter your day of the weekend");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day == 1 || day == 3) {
            System.out.println("Kaam pe jao");
        }
        else if(day == 4){
            System.out.println("Suto Aaj Damm Bhar4");
        }
        else if(day == 5){
            System.out.println("Enter your day");
            Scanner sc2 = new Scanner(System.in);
            int days = sc2.nextInt();
            if(days == 5 || days == 30){
                System.out.println("Nested loop");
            }
            sc2.close();
        }
        else{
            System.out.println("Its your work from day");
        }
        sc.close();
    }
}
