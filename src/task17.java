import java.util.ArrayDeque;
import java.util.Arrays;

public class task17 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>(Arrays.asList("a", "b", "c", "b", "a"));
        System.out.println(deque);

        deque.removeFirstOccurrence("b");
        System.out.println("After removeFirstOccurrence('b'): " + deque);

        deque.removeLastOccurrence("a");
        System.out.println("After removeLastOccurrence('a'): " + deque);
    }
}