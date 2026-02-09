import java.util.HashSet;

public class task03 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(9);
        numbers.add(6);

        System.out.println(numbers.size());

        System.out.println(numbers.isEmpty());

        numbers.clear();

        System.out.println(numbers.isEmpty());
    }
}