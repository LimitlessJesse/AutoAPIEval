import java.awt.AdjustmentEvent;
import java.awt.AdjustmentListener;
import java.awt.Scrollbar;

public class Scrollbar_5 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        
        // Adding an AdjustmentListener to the Scrollbar
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Perform actions when adjustment value changes
                System.out.println("Adjustment Value Changed");
            }
        });
    }
}
