import javax.swing.JScrollBar;
import javax.swing.event.AdjustmentListener;

public class JScrollBar_15 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        AdjustmentListener[] adjustmentListeners = scrollBar.getAdjustmentListeners();
        
        for (AdjustmentListener listener : adjustmentListeners) {
            System.out.println(listener);
        }
    }
}
