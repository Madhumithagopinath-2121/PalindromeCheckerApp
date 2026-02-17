public class PalindromeCheckerApp {
    /**
            *MAIN CLASS - UseCase2PalindromeCheckerApp

* Use Case 2: Hardcoded Palindrome Validation

* Description:
            * This class demonstrates basic palindrome validation
* using a hardcoded string value.

* At this stage, the application:
            * - Stores a predefined string
* - Compares characters from both ends
* - Determines whether the string is a palindrome
* - Displays the result on the console

* This use case introduces fundamental comparison logic
* before using advanced data structures.
*

        * @author Developer
* @version 2.0
          */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Compare characters at the current pointers
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            // Move pointers inward
            left++;
            right--;
        }
        return true; // All characters matched
    }
    public static void main(String[] args){
        System.out.println("Author: Madhumitha");
        System.out.println("Version : 2.0");
        String input = "MADAM";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}