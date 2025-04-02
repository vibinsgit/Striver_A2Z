//https://leetcode.com/problems/reverse-integer/description/

public class ReverseNumber {
    public static void main(String[] args) {
        int x = -120;
        int num = reverseDigit(x);
        System.out.println(num);
    }

    static int reverseDigit(int num) {
        int reverseNum = 0;
        while (num != 0) {
            int rem = num % 10;

            if(reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE && rem > 7)) {
                return 0;
            }
            if(reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE && rem < -8)) {
                return 0;
            }
            reverseNum = reverseNum * 10 + rem;
            num /= 10;
        }
        return reverseNum;
    }
}
