import javax.swing.*;
import javax.swing.plaf.multi.MultiSplitPaneUI;
import java.awt.*;

public class MultiSplitPaneUI_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);

        MultiSplitPaneUI multiSplitPaneUI = new MultiSplitPaneUI();
        multiSplitPaneUI.paint(panel1.getGraphics(), panel1);
        multiSplitPaneUI.paint(panel2.getGraphics(), panel2);

        frame.setVisible(true);
    }
}
