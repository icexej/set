import java.util.HashSet;
import java.util.Arrays;

public class task04 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(Arrays.asList("Ais", "Malika", "Gulzat", "Marina", "Davlet"));

        boolean success = names.remove("Malika");

        System.out.println("Success: " + success);
        System.out.println("Resulting set: " + names);
    }
}