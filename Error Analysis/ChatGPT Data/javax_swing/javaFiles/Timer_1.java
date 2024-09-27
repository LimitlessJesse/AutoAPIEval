import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_1 {
    public static void main(String[] args) {

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed repeatedly after 1 second
                System.out.println("Timer triggered");
            }
        });
        timer.start();
    }
}
