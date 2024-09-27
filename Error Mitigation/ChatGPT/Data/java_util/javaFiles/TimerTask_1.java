import java.util.TimerTask;

public class TimerTask_1 {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is being executed");
            }
        };

        task.run();
    }
}
