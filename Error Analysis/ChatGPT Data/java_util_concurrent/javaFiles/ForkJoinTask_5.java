import java.util.concurrent.ForkJoinTask;

public class ForkJoinTask_5 {
    public static void main(String[] args) {
        ForkJoinTask<Boolean> task = new ForkJoinTask<Boolean>() {
            @Override
            protected boolean exec() {
                // Implementation of fork/join task
                return true;
            }
        };

        // Check if the task completed abnormally
        boolean completedAbnormally = task.isCompletedAbnormally();

        System.out.println("Task completed abnormally: " + completedAbnormally);
    }
}
