public class UC10PalindromeCheckerApp {

    public static void main(String[] args) {
        // String with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Step 1: Preprocessing
        // toLowerCase() ignores case sensitivity
        // replaceAll("[^a-zA-Z0-9]", "") removes all non-alphanumeric characters (spaces, commas)
        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Step 2: Palindrome Logic (Two-Pointer)
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + normalized);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}