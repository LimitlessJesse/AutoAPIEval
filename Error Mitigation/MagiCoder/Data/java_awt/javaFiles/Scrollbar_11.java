import java.awt.Scrollbar;
import java.awt.event.AdjustmentListener;

public class Scrollbar_11 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        AdjustmentListener listener = event -> System.out.println("Adjustment event occurred");
        scrollbar.addAdjustmentListener(listener);
        scrollbar.removeAdjustmentListener(listener);
    }
}
