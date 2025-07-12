import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names (type 'stop' to end):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) break;
            names.add(name);
        }
        System.out.println("Student names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
