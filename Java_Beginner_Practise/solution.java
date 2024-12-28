import java.io.*;
import java.util.Scanner;
public class solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    int queries = sc.nextInt();
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       
       int j = 1;
       for(int i = 1; i<=c; i++){
          int n = a + j* b;
          System.out.print(n+ " ");
          a = n;
          j = j * 2;
       }
    }
}