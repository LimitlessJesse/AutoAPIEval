import java.util.Timer;
import java.util.TimerTask;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed after delay");
            }
        };
        long delay = 2000; // Delay of 2 seconds
        timer.schedule(task, delay);
    }
}
