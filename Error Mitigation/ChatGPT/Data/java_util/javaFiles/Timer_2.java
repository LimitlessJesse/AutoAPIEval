import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed at: " + new Date());
            }
        };
        
        Date time = new Date(System.currentTimeMillis() + 5000); // Schedule task to run after 5 seconds
        
        timer.schedule(task, time);
    }
}
