import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_4 {
    public static void main(String[] args) {
        ForkJoinTask<Boolean> task = new ForkJoinTask<Boolean>() {
            @Override
            public Boolean getRawResult() {
                return true;
            }

            @Override
            protected void setRawResult(Boolean value) {
                // Do nothing
            }

            @Override
            protected boolean exec() {
                return true;
            }
        };

        boolean done = task.isDone();
        System.out.println("Task is done: " + done);
    }
}
