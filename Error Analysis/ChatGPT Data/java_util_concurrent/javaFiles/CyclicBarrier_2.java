import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrier_2 {
    public static void main(String[] args) {
        // Creating a CyclicBarrier with a party size of 3
        CyclicBarrier barrier = new CyclicBarrier(3);
        
        // Using await(long timeout, TimeUnit unit) method with a timeout of 5 seconds
        try {
            barrier.await(5, TimeUnit.SECONDS);
            System.out.println("Barrier passed within 5 seconds");
        } catch (Exception e) {
            System.out.println("Timeout occurred while waiting at the barrier");
        }
    }
}
