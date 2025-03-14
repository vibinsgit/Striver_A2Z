//https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

import java.util.List;

public class SwitchStatement {
    static double switchCase(int choice, List<Double> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0; // Handle null or empty list case
        }

        switch (choice) {
            case 1: // Area of a circle: π * r^2
                if (arr.size() < 1) return 0; // Ensure there's at least one element
                return Math.PI * arr.get(0) * arr.get(0);
            case 2: // Area of a rectangle: length * breadth
                if (arr.size() < 2) return 0; // Ensure there are two elements
                return arr.get(0) * arr.get(1);
            default:
                return 0; // Return 0 for invalid choice
        }
    }

    public static void main(String[] args) {
        System.out.println(switchCase(1, List.of(5.0))); // Circle: π * 5^2 = 78.54
        System.out.println(switchCase(2, List.of(4.0, 6.0))); // Rectangle: 4 * 6 = 24
        System.out.println(switchCase(3, List.of(2.0))); // Invalid choice: returns 0
    
    }
}
