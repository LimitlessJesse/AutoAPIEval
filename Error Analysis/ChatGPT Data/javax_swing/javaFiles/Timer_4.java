import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actions to be performed on timer tick
            }
        });
        
        timer.setInitialDelay(500); // Sets the initial delay before the timer starts
        timer.start(); // Starts the timer
    }
}
