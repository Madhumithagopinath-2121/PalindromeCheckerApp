import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static boolean twoPointerCheck(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(normalized);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(normalized);
        long end2 = System.nanoTime();
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(normalized);
        long end3 = System.nanoTime();
        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Two Pointer: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Deque: " + result3 + " | Time: " + (end3 - start3) + " ns");
        scanner.close();


    }

}

