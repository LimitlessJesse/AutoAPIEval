import java.util.concurrent.RecursiveTask;

public class RecursiveTask_1 {
    public static void main(String[] args) {
        RecursiveTask<Integer> task = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                // Perform the main computation here
                return 42; // Example result
            }
        };

        Integer result = task.compute();
        System.out.println("Result: " + result);
    }
}
