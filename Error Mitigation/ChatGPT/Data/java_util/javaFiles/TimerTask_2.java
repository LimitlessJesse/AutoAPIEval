import java.util.TimerTask;

public class TimerTask_2 {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is running");
            }
        };

        boolean isCancelled = task.cancel();
        System.out.println("Task is cancelled: " + isCancelled);
    }
}
