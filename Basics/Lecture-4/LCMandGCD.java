//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

public class LCMandGCD {
    public static void main(String[] args) {
        int gcdValue = findGcd3(11,12);
        System.out.println("GCD : " + gcdValue);
        int lcmValue = findLcm(11,12);
        System.out.println("LCM : " + lcmValue);
    }

    //Brute-force approch1
    static int findGcd1 (int a, int b) {
        int GCD = 1;
        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }

    //Brute-force approch2
    static int findGcd2 (int a, int b) {
        int GCD = 1;
        for(int i = Math.min(a, b); i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                GCD = i;
                break;
            }
        }
        return GCD;
    }

    //Optimal approch - Euclidean Algorithm
    static int findGcd3 (int a, int b) {

        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a == 0 ? b : a;
    }

    static int findLcm (int a, int b) {
        return (a * b) / findGcd3(a, b);
    }
}
