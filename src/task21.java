import java.util.ArrayDeque;

public class task21 {
    private static ArrayDeque<String> tasks = new ArrayDeque<>();

    public static void addTask(String task, boolean highPriority) {
        if (highPriority) {
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
    }

    public static void processTask() {
        String task = tasks.pollFirst();
        if (task != null) {
            System.out.println("Processing: " + task);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public static void main(String[] args) {
        addTask("Go to the university", false);
        addTask("HOMEWORK DEADLINE ", true);
        addTask("Meet with friends", false);

        System.out.println("Queue: " + tasks);

        processTask();
        processTask();
    }
}