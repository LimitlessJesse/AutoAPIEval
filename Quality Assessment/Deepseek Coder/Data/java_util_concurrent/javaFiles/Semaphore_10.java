import java.util.concurrent.Semaphore;

public class Semaphore_10 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        // Attempt to acquire a permit
        boolean permitAcquired = semaphore.tryAcquire(1);

        // Print the result
        System.out.println("Permit acquired: " + permitAcquired);
    }
}
