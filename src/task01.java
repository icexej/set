import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class task01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter numbers: ");

        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
        numbers.add(num);

        System.out.println("Unique values: " + numbers);
        }
    }
}