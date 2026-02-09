import java.util.ArrayDeque;

public class task20 {
    public static void main(String[] args) {
        String word = "radar";
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome);
    }
}