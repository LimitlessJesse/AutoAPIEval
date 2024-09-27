import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEvent_1 {
    public static void main(String[] args) {
        AdjustmentListener listener = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int adjustmentType = e.getAdjustmentType();
                System.out.println("Adjustment Type: " + adjustmentType);
            }
        };

        // Assuming you have an AdjustmentEvent object 'e'
        // listener.adjustmentValueChanged(e);
    }
}
