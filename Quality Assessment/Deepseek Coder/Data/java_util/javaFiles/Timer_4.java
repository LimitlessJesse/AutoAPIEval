import java.util.Timer;
import java.util.TimerTask;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task performed at: " + System.currentTimeMillis());
            }
        }, 0, 1000);
    }
}
