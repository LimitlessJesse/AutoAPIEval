import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Scrollbar_16 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();

        // Create an AdjustmentListener
        AdjustmentListener listener = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Scrollbar value changed: " + e.getValue());
            }
        };

        // Add the listener to the scrollbar
        scrollbar.addAdjustmentListener(listener);

        // Remove the listener from the scrollbar
        scrollbar.removeAdjustmentListener(listener);
    }
}
