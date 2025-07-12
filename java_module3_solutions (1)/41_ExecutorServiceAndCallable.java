import java.util.concurrent.*;
import java.util.*;
public class ExecutorCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(4);
        List<Callable<String>> tasks = List.of(
            () -> "Task1",
            () -> "Task2",
            () -> "Task3"
        );
        List<Future<String>> results = exec.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        exec.shutdown();
    }
}
