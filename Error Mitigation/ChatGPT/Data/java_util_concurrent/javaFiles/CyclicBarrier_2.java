import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_2 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 is waiting at the barrier");
                int arrivalIndex = barrier.await();
                System.out.println("Thread 1 has arrived at the barrier with arrival index: " + arrivalIndex);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting at the barrier");
                int arrivalIndex = barrier.await();
                System.out.println("Thread 2 has arrived at the barrier with arrival index: " + arrivalIndex);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
