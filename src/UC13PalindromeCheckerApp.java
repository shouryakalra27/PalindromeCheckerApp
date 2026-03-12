public class UC13PalindromeCheckerApp {
    public static void main(String[] args) {
        String testInput = "A man a plan a canal Panama".repeat(100);

        long startTP = System.nanoTime();
        boolean resTP = checkTwoPointer(testInput);
        long endTP = System.nanoTime();

        long startRev = System.nanoTime();
        boolean resRev = checkReversal(testInput);
        long endRev = System.nanoTime();

        System.out.println("Performance Results:");
        System.out.println("Two-Pointer Time: " + (endTP - startTP) + " ns");
        System.out.println("Reversal Time:    " + (endRev - startRev) + " ns");
    }

    public static boolean checkTwoPointer(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }

    public static boolean checkReversal(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}