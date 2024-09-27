import java.util.concurrent.Semaphore;

public class Semaphore_7 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        try {
            System.out.println("Available permits: " + semaphore.drainPermits());
            semaphore.acquire();
            System.out.println("Available permits after acquire: " + semaphore.drainPermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
