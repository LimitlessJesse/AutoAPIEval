import java.util.concurrent.Semaphore;

public class Semaphore_5 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire();
            System.out.println("Acquired the semaphore");
            semaphore.release(2);
            System.out.println("Released 2 permits");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
