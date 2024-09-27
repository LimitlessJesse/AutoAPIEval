import java.util.concurrent.*;

public class ThreadPoolExecutor_DiscardPolicy_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 0; i < 10; i++) {
            executor.execute(new Task(i));
        }

        executor.shutdown();
    }
}

class Task implements Runnable {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " is running");
    }
}
