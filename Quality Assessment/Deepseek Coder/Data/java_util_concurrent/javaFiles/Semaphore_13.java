import java.util.concurrent.Semaphore;

public class Semaphore_13 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        System.out.println("Queue length: " + semaphore.getQueueLength());
    }
}
