import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask_5 {
    public static void main(String[] args) {
        RecursiveTask<Integer> task = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                return 0;
            }
        };

        task.fork();

        boolean isCompletedNormally = task.isCompletedNormally();
        System.out.println("Task completed normally: " + isCompletedNormally);
    }
}
