import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier_1 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Thread thread1 = new Thread(new Worker(barrier), "Thread 1");
        Thread thread2 = new Thread(new Worker(barrier), "Thread 2");
        Thread thread3 = new Thread(new Worker(barrier), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Worker implements Runnable {
    private CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
