import java.util.concurrent.Semaphore;

public class Semaphore_5 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); // Create a semaphore with 1 permit
        boolean permitAcquired = semaphore.tryAcquire(); // Try to acquire a permit
        System.out.println("Permit acquired: " + permitAcquired);
    }
}
