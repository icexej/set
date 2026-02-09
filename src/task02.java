import java.util.HashSet;

public class task02 {
    public static boolean isAllowed(String name, HashSet<String> allowedNames) {
        return allowedNames.contains(name);
    }

    public static void main(String[] args) {
        HashSet<String> allowedUsers = new HashSet<>();
        allowedUsers.add("Aisulu");
        allowedUsers.add("Azamat");
        allowedUsers.add("Aiturgan");

        System.out.println(isAllowed("Aisulu", allowedUsers));
        System.out.println(isAllowed("Baizat", allowedUsers));
    }
}