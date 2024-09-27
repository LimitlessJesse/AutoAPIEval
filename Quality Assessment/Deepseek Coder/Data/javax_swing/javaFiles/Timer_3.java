import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_3 {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delayed action performed");
            }
        });

        timer.setInitialDelay(2000); // Set initial delay to 2000 milliseconds
        timer.start();
    }
}
