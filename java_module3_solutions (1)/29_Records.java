import java.util.*;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Arjun", 22),
            new Person("Meera", 28),
            new Person("Zaid", 19)
        );

        people.stream()
              .filter(p -> p.age() > 21)
              .forEach(System.out::println);
    }
}
