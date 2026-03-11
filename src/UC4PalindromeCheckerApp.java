public class UC4PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string for UC4 logic
        String input = "level";

        // Convert String to character array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        // Two-pointer approach
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Optimization: Stop as soon as a mismatch is found
            }
            start++; // Move front pointer forward
            end--;   // Move back pointer backward
        }

        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
