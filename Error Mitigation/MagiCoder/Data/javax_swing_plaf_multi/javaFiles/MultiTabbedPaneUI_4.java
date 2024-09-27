import javax.swing.*;
import javax.swing.plaf.multi.MultiTabbedPaneUI;
import java.awt.*;

public class MultiTabbedPaneUI_4 {
    public static void main(String[] args) {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("Content 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content 2"));

        MultiTabbedPaneUI multiUI = new MultiTabbedPaneUI();
        multiUI.paint(tabbedPane.getGraphics(), tabbedPane);
    }
}
