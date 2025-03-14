public class ArraysString {
    public static void main(String[] args) {
        //Array
        int[] arr = new int[5];
        arr[0] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        arrayMethod(new int[] {1,2,3,4,5});

        //String
        String name = "Vibins";
        System.out.println();
        System.out.println("String : " + name);
    }

    static void arrayMethod(int[] arr) {
        System.out.println("Array Output: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
