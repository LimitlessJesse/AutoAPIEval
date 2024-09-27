import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class Timer_1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        
        // Creating a TimerTask
        TimerTask task = new TimerTask(){
            public void run(){
                System.out.println("Task executed at: " + new Date());
            }
        };
        
        // Scheduling the task to run once at a specified time
        timer.schedule(task, new Date()); // Replace new Date() with your desired time
        
        // Cancelling the task after 5 seconds
        timer.schedule(new TimerTask(){
            public void run(){
                task.cancel();
                System.out.println("Task cancelled");
            }
        }, 5000);
    }
}
