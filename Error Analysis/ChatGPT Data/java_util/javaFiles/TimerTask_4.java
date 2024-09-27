import java.util.TimerTask;

public class TimerTask_4 {
    public static void main(String[] args) {
        // Create a new TimerTask
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimerTask running...");
                // Add your task logic here
            }
        };
        // Schedule the task to run after a specified delay
        // For example, schedule the task to run after 1 second
        new java.util.Timer().schedule(task, 1000);
    }
}
