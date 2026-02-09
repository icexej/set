import java.util.HashSet;
import java.util.Arrays;

public class task07 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println(set1);
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        System.out.println(set2);
        set1.retainAll(set2);

        System.out.println("X after retainAll: " + set1);
    }
}