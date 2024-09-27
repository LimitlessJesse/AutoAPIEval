import java.util.concurrent.Semaphore;

public class Semaphore_4 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            boolean acquired = semaphore.tryAcquire();
    
            if (acquired) {
                System.out.println("Semaphore acquired successfully");
            } else {
                System.out.println("Could not acquire semaphore");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
