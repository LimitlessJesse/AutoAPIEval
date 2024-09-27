import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_4 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        new Thread(new Task(barrier)).start();
        new Thread(new Task(barrier)).start();
        new Thread(new Task(barrier)).start();
    }
}

class Task implements Runnable {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is waiting at barrier");
            barrier.await();
            System.out.println("Thread " + Thread.currentThread().getId() + " has crossed the barrier");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
