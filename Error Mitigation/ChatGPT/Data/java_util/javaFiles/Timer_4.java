import java.util.Timer;
import java.util.TimerTask;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed at fixed rate");
            }
        };
        
        long delay = 1000; // 1 second delay
        long period = 2000; // 2 second interval
        
        timer.scheduleAtFixedRate(task, delay, period);
    }
}
