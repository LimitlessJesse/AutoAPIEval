import java.util.concurrent.Semaphore;

public class Semaphore_5 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        int queueLength = semaphore.getQueueLength();
        System.out.println("Queue Length: " + queueLength);
    }
}
