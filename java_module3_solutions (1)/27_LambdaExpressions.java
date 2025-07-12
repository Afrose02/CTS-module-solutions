import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Zara", "Liam", "Maya", "Ethan", "Ava");
        list.sort((s1, s2) -> s1.compareTo(s2));
        for (String name : list) {
            System.out.println(name);
        }
    }
}
