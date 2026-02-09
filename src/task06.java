import java.util.HashSet;
import java.util.Arrays;

public class task06 {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(setA);
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println(setB);

        setA.removeAll(setB);

        System.out.println("Result: " + setA);
    }
}