import java.util.TimerTask;

public class TimerTask_3 {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                long executionTime = scheduledExecutionTime();
                System.out.println("Scheduled execution time: " + executionTime);
            }
        };
    }
}
