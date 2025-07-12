public class VirtualThreadsDemo {
    public static void main(String[] args) throws Exception {
        Runnable task = () -> System.out.println(Thread.currentThread() + " running");
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(task);
        }
        Thread.sleep(1000);
    }
}
