import java.util.ArrayDeque;

public class task14 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        boolean first = deque.offerFirst("Element A");
        boolean last = deque.offerLast("Element B");

        System.out.println("Offer First success: " + first);
        System.out.println("Offer Last success: " + last);

        System.out.println("Current Deque: " + deque);
    }
}