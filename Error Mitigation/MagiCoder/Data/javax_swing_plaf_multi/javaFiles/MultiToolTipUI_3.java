import javax.swing.*;
import javax.swing.plaf.multi.MultiToolTipUI;
import java.awt.*;

public class MultiToolTipUI_3 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setUI(new MultiToolTipUI());
        toolTip.setTipText("This is a tooltip");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        // Simulate a tooltip being shown
        toolTip.show(frame, 100, 100);

        // Simulate a tooltip being painted
        Graphics g = frame.getGraphics();
        toolTip.paint(g, toolTip);
    }
}
