import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for matrix dimensions
        System.out.println("Enter the number of rows of the matrix:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt(); // Use correct indices
            }
        }

        // Print matrix elements
        System.out.println("The matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " "); // Use correct indices
            }
            System.out.println();
        }

        sc.close();
    }
}
