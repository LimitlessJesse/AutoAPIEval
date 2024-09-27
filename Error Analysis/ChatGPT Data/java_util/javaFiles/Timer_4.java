import java.util.Timer;
import java.util.TimerTask;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed at regular interval");
            }
        };
        
        // Scheduling the task to run after a delay of 0 ms and repeat every 1000 ms (1 second)
        timer.schedule(task, 0, 1000);
    }
}
