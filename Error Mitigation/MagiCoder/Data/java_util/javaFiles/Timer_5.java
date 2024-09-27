import java.util.Timer;
import java.util.TimerTask;

public class Timer_5 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };

        timer.schedule(task, 1000); // Schedule the task to run after 1 second

        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel(); // Cancel the timer

        // Try to schedule a task after the timer has been canceled
        timer.schedule(task, 1000);
    }
}
