import java.util.Timer;
import java.util.TimerTask;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };

        long delay = 1000; // 1 second
        long period = 5000; // 5 seconds

        timer.scheduleAtFixedRate(task, delay, period);
    }
}
