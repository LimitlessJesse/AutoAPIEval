import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_3 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads are released"));

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
            System.out.println(Thread.currentThread().getName() + " is waiting");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " released");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
