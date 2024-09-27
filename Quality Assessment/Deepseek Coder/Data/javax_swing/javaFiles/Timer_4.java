import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Delay has been set");
            }
        });

        // Set delay to 2000 milliseconds
        timer.setDelay(2000);
    }
}
