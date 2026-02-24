public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Author - MADHUMITHA");
        System.out.println("VERSION - 6.0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            queue.add(ch);   // FIFO
            stack.push(ch); // LIFO
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char queueChar = queue.remove(); // Dequeue
            char stackChar = stack.pop();    // Pop

            if (queueChar != stackChar) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();






    }
}