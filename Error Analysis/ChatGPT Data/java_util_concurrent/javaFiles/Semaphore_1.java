import java.util.concurrent.Semaphore;

public class Semaphore_1 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire();
            System.out.println("Semaphore acquired successfully.");
        } catch (InterruptedException e) {
            System.out.println("Semaphore acquire interrupted.");
        } finally {
            semaphore.release();
        }
    }
}
