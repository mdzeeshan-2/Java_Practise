public class a6 {
    public static void main(String[] args) {
        // pattern1(4);
        // System.out.println();
        // pattern2(4);
        // System.out.println();
        // pattern3(4);
        // System.out.println();
        // pattern4(4);
        // System.out.println();
        // pattern5(10);
        // System.out.println();
        // pattern6(5);
        // System.out.println();
        pattern7(10);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int coulmn = 0; coulmn <= row; coulmn++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int coulmn = n; coulmn > row; coulmn--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int coulmn = 1; coulmn <= row; coulmn++) {
                System.out.print(coulmn);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) { // 10
        int m = n / 2; // 5
        for (int row = 1; row <= n - 1; row++) { // 1 - 9
            if (row <= m) { // 6 <= 5
                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
            } else {
                for (int column = n - 1; column >= row; column--) { // c = 9; 6 >= 6 ;
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }

    static void pattern6(int n) {

        for (int row = 0; row < n; row++) {
            for (int space = 4; space > row; space--) {
                System.out.print(" ");
            }
            for (int coulmn = 0; coulmn < row; coulmn++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        int m=1;
        int l = 1;
        for (int row = 1; row <= n; row++) {
            if (row <= n / 2) {
                for (int space = 0; space < n - row; space++) {
                    System.out.print(" ");
                }
                for (int coulmn = row; coulmn >= 1; coulmn--) {
                    System.out.print(coulmn);
                }
                for (int coulmn = 2; coulmn <= row; coulmn++) {
                    System.out.print(coulmn);
                }
                System.out.println();
            } else { // 6
                for (int space = row; space >= 1; space--) { // 5 < 10-6 = 6 < 10;
                    System.out.print(" ");
                }
                for (int coulmn = row-2*m; coulmn >= 1; coulmn--) {
                System.out.print(coulmn);
                }
                m++;
                for (int coulmn = 2; coulmn <= n/2-l; coulmn++) {
                    System.out.print(coulmn);
                }
                l++;
                System.out.println();
            }
        }
    }
}
