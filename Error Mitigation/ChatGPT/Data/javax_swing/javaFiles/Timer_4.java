import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action performed");
            }
        });
        
        timer.setRepeats(false); // Set repeats to false
        
        timer.start(); // Start the timer
    }
}
