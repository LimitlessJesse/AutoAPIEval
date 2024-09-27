import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JScrollBar_18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10, 0, 100);
        scrollBar.setPreferredSize(new java.awt.Dimension(100, 16));
        scrollBar.setUnitIncrement(10);

        BoundedRangeModel model = new DefaultBoundedRangeModel(50, 0, 0, 100);
        scrollBar.setModel(model);

        ChangeListener listener = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JScrollBar source = (JScrollBar)e.getSource();
                int value = source.getValue();
                System.out.println("Value: " + value);
            }
        };

        model.addChangeListener(listener);

        frame.getContentPane().add(scrollBar);
        frame.setVisible(true);
    }
}
