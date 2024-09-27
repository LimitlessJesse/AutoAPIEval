import java.util.concurrent.Semaphore;

public class Semaphore_1 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            semaphore.acquire();
            System.out.println("Permit acquired successfully");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while waiting for permit");
        }
    }
}
