import java.util.HashSet;
import java.util.Arrays;

public class task08 {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(setA);
        HashSet<String> setB = new HashSet<>(Arrays.asList("A", "C"));
        System.out.println(setB);

        if (setA.containsAll(setB)) {
            System.out.println("Set A contains all elements of set B");
        } else {
            System.out.println("Set A does not contains all elements of set B");
        }
    }
}