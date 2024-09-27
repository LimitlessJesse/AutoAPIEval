import java.util.Timer;
import java.util.TimerTask;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };
        timer.schedule(task, 1000); // Schedule the task to run after 1 second
    }
}
