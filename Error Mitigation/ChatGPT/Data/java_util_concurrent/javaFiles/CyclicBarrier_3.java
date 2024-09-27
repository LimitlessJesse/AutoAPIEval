import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrier_3 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        try {
            int arrivalIndex = barrier.await(5, TimeUnit.SECONDS);
            System.out.println("Arrival index: " + arrivalIndex);
        } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
