public class UC2PalindromeCheckerApp {

    public static void main(String[] args) {
        // Step 1: Define a hardcoded string literal
        String original = "madam";

        // Step 2: Reverse the string
        // We use StringBuilder because it has a built-in reverse() method
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Word to check: " + original);

        // Step 3: Conditional Statement (if-else) to check palindrome
        if (original.equals(reversed)) {
            System.out.println("Result: The word is a Palindrome.");
        } else {
            System.out.println("Result: The word is NOT a Palindrome.");
        }
    }
}