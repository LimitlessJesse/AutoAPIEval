import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task performed at: " + new Date());
            }
        }, new Date(System.currentTimeMillis() + 1000));
    }
}
