import javax.swing.*;
import javax.swing.plaf.multi.MultiSplitPaneUI;
import java.awt.*;

public class MultiSplitPaneUI_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        MultiSplitPaneUI multiSplitPaneUI = new MultiSplitPaneUI();
        multiSplitPaneUI.update(frame.getGraphics(), splitPane);

        JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane, panel3);
        multiSplitPaneUI.update(frame.getGraphics(), splitPane2);
    }
}
