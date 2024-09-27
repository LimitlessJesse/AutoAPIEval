import java.util.concurrent.Semaphore;

public class Semaphore_4 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire();
            System.out.println("Semaphore acquired");
            // Perform some operations
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println("Semaphore released");
        }
    }
}
