import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * UC6: Queue + Stack Based Palindrome Check
 * This class compares FIFO (Queue) and LIFO (Stack) outputs
 * to determine if a string is a palindrome.
 * * @author shouryakalra27
 * @version 1.0
 */
public class UC6PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "deified";

        // Initialize Stack (LIFO) and Queue (FIFO)
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 1: Fill both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        // Step 2: Compare characters one by one
        // Queue.poll() gives front-to-back, Stack.pop() gives back-to-front
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Testing string: " + input);

        // Step 3: Print Result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
