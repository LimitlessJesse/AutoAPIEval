import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier_5 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        // Perform some operations with the barrier

        // Reset the barrier
        barrier.reset();
    }
}
