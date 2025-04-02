//https://www.geeksforgeeks.org/problems/count-digits5716/1

public class CountDigits {
    public static void main(String[] args) {
        int output = countingDigits(2446);
        System.out.println(output);
    }

    public static int countingDigits (int num) {
        int originalDigit = num;
        int count = 0;

        while(num > 0) {
            int rem = num % 10;
            if(rem != 0 && originalDigit % rem == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}