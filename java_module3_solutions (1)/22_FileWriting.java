import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String text = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
