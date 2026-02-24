public class PalindromeCheckerApp {
    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of linked list
    static Node head = null;

    // Method to add node at end
    public static void addNode(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Method to check palindrome
    public static boolean isPalindrome() {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using Fast & Slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare first and second half
        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println("Author - MADHUMITHA");
        System.out.println("VERSION - 8.0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Remove special characters & convert to lowercase
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Convert string to linked list
        for (char ch : input.toCharArray()) {
            addNode(ch);
        }

        if (isPalindrome()) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}