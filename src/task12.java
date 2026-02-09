import java.util.ArrayDeque;

public class task12 {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("name 1");
        stack.push("name 2");
        stack.push("name 3");

        System.out.println("Result: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}