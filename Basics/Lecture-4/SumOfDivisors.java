//https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

public class SumOfDivisors {
    public static void main(String[] args) {
        int result = findDivisors(5);
        System.out.println(result);
    }

    static int findDivisors (int n) {
        int totalSum = 0;

        for(int i = 1; i <= n; i++) {
            totalSum += (n / i) * i;
        }

        return totalSum;
    }
}
