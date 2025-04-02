//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

public class MinimumJumps {
    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9})); 
        System.out.println(minJumps(new int[]{1, 4, 3, 2, 6, 7}));               
        System.out.println(minJumps(new int[]{0, 10, 20}));                      
    }

    static int minJumps (int[] arr) {
        int n = arr.length;

        if(n <= 1) {
            return 0;
        }

        if(arr[0] == 0) {
            return -1;
        }

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for(int i = 0; i < n - 1; i++) {

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if(steps == 0) {
                jumps++;

                if(i >= maxReach) {
                    return -1;
                }

                steps = maxReach - i;
            }

            if(maxReach >= n - 1) {
                return jumps;
            }
        }

        return -1;
    }
}
