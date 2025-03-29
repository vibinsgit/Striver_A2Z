public class Functions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println("Sum of a & b by function :" + result);
    }

    //function
    static int sum(int a, int b) {
        return a + b;
    }
}
