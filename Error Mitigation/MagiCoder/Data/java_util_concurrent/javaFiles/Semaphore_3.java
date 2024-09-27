import java.util.concurrent.Semaphore;

public class Semaphore_3 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire(1);
            System.out.println("Acquired permit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
