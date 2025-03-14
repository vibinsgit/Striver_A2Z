//https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava
public class IfElseStatement {
    public static String Solution(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater"; 
        }
    }
    public static void main(String[] args) {
        System.out.println(Solution(5, 10));  // Output: lesser
        System.out.println(Solution(10, 10)); // Output: equal
        System.out.println(Solution(15, 10)); // Output: greater
    }
}
