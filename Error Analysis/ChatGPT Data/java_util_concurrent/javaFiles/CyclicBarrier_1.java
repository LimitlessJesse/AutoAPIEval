import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_1 {
    public static void main(String[] args) {
        Runnable barrierAction = () -> System.out.println("All parties have arrived at the barrier");
        CyclicBarrier barrier = new CyclicBarrier(3, barrierAction);

        Runnable task1 = () -> {
            try {
                System.out.println("Task 1 is waiting at the barrier");
                barrier.await();
                System.out.println("Task 1 has passed the barrier");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable task2 = () -> {
            try {
                System.out.println("Task 2 is waiting at the barrier");
                barrier.await();
                System.out.println("Task 2 has passed the barrier");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
