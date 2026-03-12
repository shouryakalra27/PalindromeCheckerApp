public class UC11PalindromeCheckerApp {

    public static void main(String[] args) {
        String testWord = "Step on no pets";

        boolean result = checkPalindrome(testWord);

        System.out.println("Input: " + testWord);
        if (result) {
            System.out.println("Result: Success! It's a palindrome.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String input) {
        if (input == null) return false;

        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
