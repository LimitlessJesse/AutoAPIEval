import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_3 {
    public static void main(String[] args) {
        ForkJoinTask<Boolean> task = new ForkJoinTask<Boolean>() {
            @Override
            public Boolean getRawResult() {
                return null;
            }

            @Override
            protected void setRawResult(Boolean value) {
            }

            @Override
            protected boolean exec() {
                // Task execution logic
                return true;
            }
        };

        boolean isCancelled = task.cancel(true);
        System.out.println("Task cancelled: " + isCancelled);
    }
}
