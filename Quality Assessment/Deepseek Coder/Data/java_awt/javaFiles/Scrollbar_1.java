import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Scrollbar_1 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = e.getAdjustable().getValue();
                System.out.println("The current value of the scrollbar is: " + value);
            }
        });
    }
}
