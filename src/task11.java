import java.util.ArrayDeque;

public class task11 {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("First element (peek): " + q.peek());

        System.out.print("Polling all elements: ");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}