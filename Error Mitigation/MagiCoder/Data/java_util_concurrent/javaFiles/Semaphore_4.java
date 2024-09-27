import java.util.concurrent.Semaphore;

public class Semaphore_4 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire();
            System.out.println("Critical section is being executed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
