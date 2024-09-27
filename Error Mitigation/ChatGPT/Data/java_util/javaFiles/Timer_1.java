import java.util.Timer;
import java.util.TimerTask;

public class Timer_1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed after delay");
            }
        };
        
        long delay = 2000; // 2 seconds delay
        
        timer.schedule(task, delay);
    }
}
