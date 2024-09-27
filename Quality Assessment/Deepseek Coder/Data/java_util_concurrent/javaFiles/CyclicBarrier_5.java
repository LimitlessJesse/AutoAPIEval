import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_5 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Barrier Reached"));

        new Thread(new Task(barrier), "Thread 1").start();
        new Thread(new Task(barrier), "Thread 2").start();
        new Thread(new Task(barrier), "Thread 3").start();
    }
}

class Task implements Runnable {
    CyclicBarrier barrier;

    Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
