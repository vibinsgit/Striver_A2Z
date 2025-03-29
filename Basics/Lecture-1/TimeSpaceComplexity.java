/* 
Time Complexity :

    The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity.

    Best Case: This term refers to the case where the code takes the least amount of time to get executed.
    Worst Case: This term refers to the case where the code takes the maximum amount of time to get executed.
    Average Case: This term is pretty self-explanatory. This is basically the case between the best and the worst.

Space Complexity : 

    The term space complexity generally refers to the memory space that a code uses while being executed. 
*/



public class TimeSpaceComplexity {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
        int max = findMax(numbers);
        System.out.println("Maximum number: " + max);
        printPairs(numbers);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];       // O(1) space (only one variable)
        for (int num : arr) {   // O(n) time (loop runs n times)
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {     // O(n)
            for (int j = 0; j < arr.length; j++) { // O(n)
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }                                          // O(n * n) - O(n^2)
    }
}
