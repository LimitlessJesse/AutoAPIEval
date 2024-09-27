import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 {
    public static void main(String[] args) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long when = e.getWhen();
                System.out.println("The event happened at: " + when + " milliseconds since the epoch");
            }
        };

        // Simulate an action event
        ActionEvent event = new ActionEvent(this, 0, "");
        listener.actionPerformed(event);
    }
}
