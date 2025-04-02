//https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = -121;
        if(findPalindrome(num)) {
            System.out.println("Palindrome number.");
        } else {
            System.out.println("Not a palindrome number.");
        }
    }

    static boolean findPalindrome(int num) {

        if(num < 0) {
            return false;
        }

        int orginalNum = num;
        int reverseNum = 0;

        while (num != 0) {
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num /= 10;
        }

        return orginalNum == reverseNum;
    }
}
