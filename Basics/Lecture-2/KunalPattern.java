public class KunalPattern {
    public static void main(String[] args) {
        kpattern1(5);
        System.out.println("-----------------------");
        kpattern2(5);
        System.out.println("-----------------------"); 
        kpattern3(5);
        System.out.println("-----------------------");
        kpattern4(5);
        System.out.println("-----------------------");
        kpattern5(5);
        System.out.println("-----------------------");
        kpattern6(5);
        System.out.println("-----------------------");
        kpattern7(5);
        System.out.println("-----------------------");
        kpattern8(5);
        System.out.println("-----------------------");
    }

    public static void kpattern1(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kpattern2(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kpattern3(int n) {
        for(int row = 1; row <= n ; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kpattern4(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void kpattern5(int n) {
        for(int row = 1; row < 2 * n; row++) {
            int totalRow = row > n ? 2 * n - row : row;
            for(int col = 1; col <= totalRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kpattern6(int n) {
        for(int row = 1; row < 2 * n; row++) {
            int totalRow = row > n ? 2 * n - row : row;
            int totalSpace = n - totalRow;

            for(int space = 1; space <= totalSpace; space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= totalRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kpattern7(int n) {
        for(int row = 1; row <= n ; row++) {
            for(int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void kpattern8(int n) {
        for(int row = 1; row < 2 * n; row++) {
            int totalRow = row > n ? 2 * n - row : row;

            for(int space = 1; space <= n - totalRow; space++){
                System.out.print("  ");
            }

            for(int col = totalRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for(int col = 2; col <= totalRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    
}