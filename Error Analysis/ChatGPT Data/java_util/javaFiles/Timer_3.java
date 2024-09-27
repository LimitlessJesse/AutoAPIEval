import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class Timer_3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Task to be executed at each scheduled interval
                System.out.println("Task executed at: " + new Date());
            }
        };
        
        Date firstTime = new Date(); // Set the initial time to current time
        long period = 1000; // Period in milliseconds (e.g. 1000 milliseconds = 1 second)
        
        timer.schedule(task, firstTime, period);
    }
}
