import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Scrollbar_9 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int orientation = e.getAdjustable().getOrientation();
                System.out.println("Orientation: " + (orientation == Adjustable.HORIZONTAL? "Horizontal" : "Vertical"));
            }
        });
    }
}
