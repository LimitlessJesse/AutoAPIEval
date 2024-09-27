import javax.management.timer.TimerMBean;
import javax.management.timer.Timer;

public class Timer_4 {
    public static void main(String[] args) {
        TimerMBean timer = new Timer();
        timer.start();
    }
}
