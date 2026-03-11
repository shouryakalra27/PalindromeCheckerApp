import java.util.Stack;
public class UC5PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 2: Pop characters to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed (from Stack): " + reversed);

        // Step 3: Compare
        if (input.equalsIgnoreCase(reversed.toString())) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
