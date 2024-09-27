import java.util.Timer;
import java.util.TimerTask;

public class Timer_3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed at regular intervals");
            }
        };
        
        long delay = 1000; // 1 second delay before first execution
        long period = 2000; // 2 second interval between executions
        
        timer.schedule(task, delay, period);
    }
}
