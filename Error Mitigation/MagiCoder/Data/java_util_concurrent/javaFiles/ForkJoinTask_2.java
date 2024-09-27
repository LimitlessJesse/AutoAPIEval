import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask_2 {
    public static void main(String[] args) {
        RecursiveTask<Integer> task = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                return 1;
            }
        };

        task.fork();

        Integer result = task.getRawResult();
        System.out.println(result);
    }
}
