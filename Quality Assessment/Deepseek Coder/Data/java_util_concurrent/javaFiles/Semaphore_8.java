import java.util.concurrent.Semaphore;

public class Semaphore_8 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        boolean permitAcquired = false;

        try {
            permitAcquired = semaphore.tryAcquire(1000, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Permit acquired: " + permitAcquired);
    }
}
