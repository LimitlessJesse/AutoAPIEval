import java.util.concurrent.Semaphore;

public class Semaphore_2 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire();
            System.out.println("Semaphore acquired");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println("Semaphore released");
        }
    }
}
