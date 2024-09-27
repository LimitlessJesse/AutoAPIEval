import java.util.concurrent.Semaphore;

public class Semaphore_12 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        boolean hasQueuedThreads = semaphore.hasQueuedThreads();
        System.out.println(hasQueuedThreads);
    }
}
