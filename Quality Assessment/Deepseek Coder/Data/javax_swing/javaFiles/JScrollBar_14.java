import javax.swing.*;
import java.awt.event.*;

public class JScrollBar_14 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();

        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Value changed: " + e.getValue());
            }
        });

        // Remove the listener
        scrollBar.removeAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Value changed: " + e.getValue());
            }
        });
    }
}
