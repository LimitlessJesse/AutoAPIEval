import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_5 {
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
                return false;
            }
        };

        boolean cancelled = task.isCancelled();
        System.out.println("Task is cancelled: " + cancelled);
    }
}
