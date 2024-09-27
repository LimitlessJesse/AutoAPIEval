import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_2 {
    public static void main(String[] args) {
        ForkJoinTask<Long> task = new RecursiveTask<Long>() {
            @Override
            protected Long compute() {
                return 10L;
            }
        };

        Long result = task.getRawResult();
        System.out.println("Raw result: " + result);
    }
}
