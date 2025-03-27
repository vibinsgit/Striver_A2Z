public class StriverPattern {
    public static void main(String[] args) {
        pattern4(5);
        System.out.println("-----------------------------------");
        pattern5(5);
        System.out.println("-----------------------------------");
        pattern6(5);
        System.out.println("-----------------------------------");
        pattern7(5);
    }
    static void pattern4(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for(int row = 0; row < n; row++) {
            for(int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }
            for(int col = 0; col < 2 * row + 1; col++) {
                System.out.print("* ");
            }
            for(int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
