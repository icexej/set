import java.util.HashSet;
import java.util.Arrays;

public class task09 {
    public static void main(String[] args) {
        String sentence = "apple banana apple orange banana";
        System.out.println(sentence);

        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Unique words: " + uniqueWords);
    }
}