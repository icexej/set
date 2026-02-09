import java.util.ArrayDeque;

public class task19 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Ais");
        deque.add("Gulya");

        deque.clear();

        System.out.println("Is empty: " + deque.isEmpty());
        System.out.println("Peek: " + deque.peek());
    }
}