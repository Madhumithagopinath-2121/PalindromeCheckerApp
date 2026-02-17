public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two pointer approach
        int left = 0;
        int right = chars.length - 1;

        // Compare characters from both ends
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }
    public static void main(String[] args){
        System.out.println("Author - MADHUMITHA");
        System.out.println("VERSION - 4.0");


        String input = "MADAM";

        System.out.println("Input String: " + input);

        if (isPalindrome(input)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}