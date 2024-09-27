import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_4 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2);
        System.out.println(barrier.isBroken()); // prints false

        // Break the barrier
        try {
            barrier.await();
            barrier.await(); // this will throw a BrokenBarrierException
        } catch (Exception e) {
            System.out.println(barrier.isBroken()); // prints true
        }
    }
}
