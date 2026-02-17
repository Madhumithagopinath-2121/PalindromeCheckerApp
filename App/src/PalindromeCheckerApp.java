public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Build reversed string using stack pop
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed string
        return input.equals(reversed);
    }
    public static void main(String[] args){
        System.out.println("Author - MADHUMITHA");
        System.out.println("VERSION - 5.0");


        String input = "MADAM";

        System.out.println("Input String: " + input);

        if (isPalindrome(input)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}