public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Remove special characters & convert to lowercase
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}