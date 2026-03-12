interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
}

class ReversalStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String text) {
        return strategy.isPalindrome(text);
    }
}

public class UC12PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "Racecar";
        PalindromeContext context = new PalindromeContext();

        context.setStrategy(new TwoPointerStrategy());
        System.out.println("Using Two-Pointer: " + context.executeStrategy(testInput));

        context.setStrategy(new ReversalStrategy());
        System.out.println("Using Reversal: " + context.executeStrategy(testInput));
    }
}