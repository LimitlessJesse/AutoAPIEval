import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier_2 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        new Thread(() -> {
            try {
                System.out.println("Thread 1 is waiting at the barrier");
                barrier.await();
                System.out.println("Thread 1 has crossed the barrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting at the barrier");
                barrier.await();
                System.out.println("Thread 2 has crossed the barrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Thread 3 is waiting at the barrier");
                barrier.await();
                System.out.println("Thread 3 has crossed the barrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
