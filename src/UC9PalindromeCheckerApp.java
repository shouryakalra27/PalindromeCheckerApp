public class UC9PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "kayak";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Testing string: " + input);
        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int start, int end) {
        // Base Condition: If pointers meet or cross, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Check if characters at current pointers match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: Move pointers inward
        return isPalindrome(str, start + 1, end - 1);
    }
}