import java.util.concurrent.Semaphore;

public class Semaphore_5 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            System.out.println("Acquired permit");
            semaphore.release(1);
            System.out.println("Released permit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
