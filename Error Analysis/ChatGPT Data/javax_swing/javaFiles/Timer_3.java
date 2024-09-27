import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_3 {
    
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed after specified delay
            }
        });
        
        timer.setDelay(2000); // Set delay to 2 seconds (2000 milliseconds)
        timer.start(); // Start the timer
    }
}
