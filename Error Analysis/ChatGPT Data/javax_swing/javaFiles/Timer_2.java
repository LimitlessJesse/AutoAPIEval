import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Timer triggered");
                ((Timer) e.getSource()).stop();
            }
        });
        
        timer.start();
    }
}
