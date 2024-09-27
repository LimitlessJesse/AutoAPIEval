import java.util.TimerTask;

public class TimerTask_1 {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Task logic here
            }
        };
        
        boolean result = task.cancel();
        System.out.println("Task cancelled: " + result);
    }
}
