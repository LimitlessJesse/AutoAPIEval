import java.util.concurrent.Semaphore;

public class Semaphore_3 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        
        int permits = semaphore.availablePermits();
        System.out.println("Available permits: " + permits);
    }
}
