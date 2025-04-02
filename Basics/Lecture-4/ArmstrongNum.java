//https://leetcode.com/problems/armstrong-number/

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        if(findArmstrongNumber(num)) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number.");
        }
    }

    static boolean findArmstrongNumber (int num) {
        int orginalNum = num;
        int armstrongNum = 0;

        while (num > 0) {
            int rem = num % 10;
            armstrongNum = armstrongNum + (int)(Math.pow(rem, 3));
            num = num / 10;
        }

        return orginalNum == armstrongNum ? true : false;
    }
}
