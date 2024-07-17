package string;

import java.util.*;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the length of string");
            int n = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            if (n <= 0) {
                System.out.println("The length of the string must be greater than 0.");
                return;
            }

            char[] char1 = new char[n];
            System.out.println("Enter the String");
            String st = sc.nextLine();

            if (st.length() != n) {
                System.out.println("The length of the string does not match the given length.");
                return;
            }

            // Copy the characters from the string to the array
            for (int i = 0; i < char1.length; i++) {
                char1[i] = st.charAt(i);
            }

            // Reverse the character array
            int start = 0;
            int end = char1.length - 1;
            while (start < end) {
                char temp = char1[start];
                char1[start] = char1[end];
                char1[end] = temp;
                start++;
                end--;
            }

            // Construct the final reversed string
            String str = "";
            for (int i = 0; i < n; i++) {
                str = str + char1[i];
            }

            // Print the reversed string
            System.out.println("Reversed string: " + str);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer for the length of the string.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
