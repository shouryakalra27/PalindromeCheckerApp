public class UC3PalindromeCheckerApp {
        public static void main(String[] args) {
            // Step 1: Input string (Hardcoded for UC3 logic)
            String original = "radar";
            String reversed = ""; // Initialize an empty string to hold the reverse

            // Step 2: Loop through the original string backwards
            // original.length() - 1 is the index of the last character
            for (int i = original.length() - 1; i >= 0; i--) {
                // String concatenation (+) creates a new String object each time
                reversed = reversed + original.charAt(i);
            }

            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);

            // Step 3: Compare content using .equals()
            if (original.equalsIgnoreCase(reversed)) {
                System.out.println("Result: The string is a Palindrome.");
            } else {
                System.out.println("Result: The string is NOT a Palindrome.");
            }
        }
    }
