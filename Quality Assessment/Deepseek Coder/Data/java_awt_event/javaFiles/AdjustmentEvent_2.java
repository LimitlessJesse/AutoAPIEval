import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;
import javax.swing.JFrame;

public class AdjustmentEvent_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adjustment Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10, 0, 100);
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = e.getValue();
                System.out.println("Scrollbar value: " + value);
            }
        });

        frame.add(scrollBar);
        frame.setVisible(true);
    }
}
