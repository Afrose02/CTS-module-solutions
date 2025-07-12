import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 student IDs and names:");
        for (int i = 0; i < 3; i++) {
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            students.put(id, name);
        }
        System.out.print("Enter student ID to search: ");
        int searchId = scanner.nextInt();
        if (students.containsKey(searchId)) {
            System.out.println("Name: " + students.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
