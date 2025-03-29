public class StriverPattern {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("-----------------------------------");
        pattern2(5);
        System.out.println("-----------------------------------");
        pattern3(5);
        System.out.println("-----------------------------------");
        pattern5(5);
        System.out.println("-----------------------------------");
        pattern6(5);
        System.out.println("-----------------------------------");
        pattern7(5);
        System.out.println("-----------------------------------");
        pattern8(5);
        System.out.println("-----------------------------------");
        pattern9(5);
        System.out.println("-----------------------------------");
        pattern10(5);
        System.out.println("-----------------------------------");
        pattern11(5);
        System.out.println("-----------------------------------");
        pattern12(5);
    }

    static void pattern1(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
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

    static void pattern8(int n) {
        for(int row = 0; row < n; row++) {
            for(int space = 0; space < row; space++) {
                System.out.print("  ");
            } 
            for(int col = 0; col < (2 * (n - row) - 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
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

    static void pattern10 (int n) {
        for(int row = 1; row <= 2 * n; row ++) {
            int totalClo = row > n ? 2 * n - row : row;
            for(int col = 1; col <= totalClo; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11 (int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = row; col >= 1; col--) {
                if(col % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12 (int n) {
        int totalSpace = 2 * (n - 1);
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            for(int space = 1; space <= totalSpace; space++) {
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
            totalSpace -= 2;
        }
    }
}
 