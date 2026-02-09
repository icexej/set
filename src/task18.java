import java.util.ArrayDeque;

public class task18 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        printState("Initial", deque);


        deque.add(10);
        printState("After add(10)", deque);

        deque.add(20);
        printState("After add(20)", deque);

        deque.remove();
        printState("After remove()", deque);

        deque.clear();
        printState("After clear()", deque);
    }

    public static void printState(String action, ArrayDeque<Integer> deque) {
        System.out.println(action);
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty: " + deque.isEmpty());
        System.out.println("Content: " + deque);
        System.out.println();
    }
}