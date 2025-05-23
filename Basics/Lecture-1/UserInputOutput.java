// Java offers two input methods, Scanner and BufferedReader.
// Scanner simplifies console input for common use cases, providing easy-to-use methods for various data types.

// BufferedReader, on the other hand, offers greater control and efficiency, making it suitable for complex input scenarios and handling large volumes of data, such as reading from files or network streams.

// Getting input with library : import java.util.Scanner;
// Getting Output with System.out.println();

// Creating a BufferedReader Object: 

// First create an InputStreamReader is = new InputStreamReader(System.in);
// BufferedReader bf = new BufferedReader(is);

import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("Entered number is " + number);
        input.close();
    }
}