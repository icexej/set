import java.util.ArrayDeque;

public class task15 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        System.out.println("Empty peek(): " + deque.peek());
        System.out.println("Empty peekFirst(): " + deque.peekFirst());
        System.out.println("Empty peekLast(): " + deque.peekLast());

        deque.add("First");
        deque.add("Middle");
        deque.add("Last");

        System.out.println("\nWith elements:");
        System.out.println("peek(): " + deque.peek());
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        System.out.println("Size after peeking: " + deque.size());
    }
}