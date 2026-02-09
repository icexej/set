import java.util.ArrayDeque;

public class task13 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        System.out.print("Result: ");
        for (Integer num : deque) {
            System.out.print(num + " ");
        }
    }
}