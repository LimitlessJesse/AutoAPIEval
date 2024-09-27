import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBar_13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10, 0, 100);
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = e.getValue();
                System.out.println("ScrollBar value: " + value);
            }
        });

        frame.getContentPane().add(scrollBar);
        frame.setVisible(true);
    }
}
