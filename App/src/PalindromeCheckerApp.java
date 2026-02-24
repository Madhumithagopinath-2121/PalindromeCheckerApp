import java.util.Scanner;
public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();
        // Normalize string:
        // 1. Remove spaces
        // 2. Convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        boolean result = isPalindrome(normalized);
        if (result) {
            System.out.println("The given string is a Palindrome (Ignoring spaces & case).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();
    }

}