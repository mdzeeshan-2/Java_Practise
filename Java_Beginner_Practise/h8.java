import java.util.Scanner;

public class h8 {
    public static void main(String[] args) {
        System.out.println("Enter the Day number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("It's a Monday");
                break;
            case 2:
                System.out.println("It's a Tuesday");
                break;
            case 3:
                System.out.println("It's a Wednesday");
                break;
            case 4:
                System.out.println("It's a Thrusday");
                break;
            case 5:
                System.out.println("It's a Friday");
                break;
            case 6:
                System.out.println("It's a Saturday");
                break;
            case 7:
                System.out.println("It's a Sunday");
                break;
            default:
            System.out.println("Abey 0-8 ke andar me daal");
                break;
        }
    }
}