//https://www.geeksforgeeks.org/problems/data-type-1666706751/1

class Solution {
    static int dataTypeSize(String str) {
        switch (str.toLowerCase()) { // Convert input to lowercase for case insensitivity
            case "character":
                return 1;
            case "integer":
            case "float":
                return 4;
            case "long":
            case "double":
                return 8;
            default:
                return -1; // Return -1 for unknown data types
        }
    }

    public static void main(String[] args) {
        System.out.println(dataTypeSize("Character")); // Output: 1
        System.out.println(dataTypeSize("Integer"));   // Output: 4
        System.out.println(dataTypeSize("Float"));     // Output: 4
        System.out.println(dataTypeSize("Long"));      // Output: 8
        System.out.println(dataTypeSize("Double"));    // Output: 8
        System.out.println(dataTypeSize("String"));    // Output: -1
    }
}