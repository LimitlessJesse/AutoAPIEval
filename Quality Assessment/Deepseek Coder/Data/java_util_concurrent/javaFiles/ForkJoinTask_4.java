import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_4 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> task = new ForkJoinTask<Integer>() {
            @Override
            public Integer getRawResult() {
                return null;
            }

            @Override
            protected void setRawResult(Integer value) {

            }

            @Override
            protected boolean exec() {
                return false;
            }
        };

        pool.execute(task);

        // Check if the task is done
        boolean isTaskDone = task.isDone();
        System.out.println("Is task done? " + isTaskDone);
    }
}
