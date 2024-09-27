import java.util.Timer;
import java.util.TimerTask;

public class Timer_5 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is running");
            }
        };

        timer.schedule(task, 1000); // Schedule the task to run after 1 second

        // Cancel the timer before the task runs
        timer.cancel();
    }
}
