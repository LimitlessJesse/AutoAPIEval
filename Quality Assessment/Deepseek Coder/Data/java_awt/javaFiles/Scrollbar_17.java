import java.awt.Scrollbar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class Scrollbar_17 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();

        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Scrollbar value changed: " + e.getValue());
            }
        });

        AdjustmentListener[] adjustmentListeners = scrollbar.getAdjustmentListeners();

        for (AdjustmentListener listener : adjustmentListeners) {
            System.out.println(listener.getClass().getName());
        }
    }
}
