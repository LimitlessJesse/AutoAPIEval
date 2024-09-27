import java.util.concurrent.*;

public class Executors_5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool(2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Hello, World!";
            }
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
