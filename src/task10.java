import java.util.HashSet;

public class task10 {
    public static void main(String[] args) {
        String[] s = {"Apple", "apple", "APPLE", "Banana", "banana", "ORANGE"};

        System.out.println(s);

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : s) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println("Unique words: " + uniqueWords);
    }
}