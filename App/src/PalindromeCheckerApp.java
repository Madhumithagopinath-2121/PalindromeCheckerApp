public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Author - MADHUMITHA");
        System.out.println("VERSION - 3.0");


        String input = "Hello";
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        // Reverse logic
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(chars);

        // Display original and reversed
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Compare both strings
        if (input.equals(reversed)) {
            System.out.println("Both strings are SAME (Palindrome)");
        } else {
            System.out.println("Both strings are DIFFERENT (Not a Palindrome)");
        }
    }
}