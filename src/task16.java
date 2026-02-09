import java.util.ArrayDeque;

public class task16 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");

        System.out.println("Poll (default): " + deque.poll());
        System.out.println("PollFirst: " + deque.pollFirst());
        System.out.println("PollLast: " + deque.pollLast());

        System.out.println("Poll from empty: " + deque.poll());
    }
}