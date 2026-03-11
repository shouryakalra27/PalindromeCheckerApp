import java.util.ArrayDeque;
import java.util.Deque;
public class UC7PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "rotator";
        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert all characters into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Step 2: Compare front and rear until 0 or 1 element remains
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Testing string: " + input);

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}