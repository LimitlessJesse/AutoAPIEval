import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthTabbedPaneUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("Content 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content 2"));

        SynthTabbedPaneUI synthTabbedPaneUI = new SynthTabbedPaneUI();
        BasicTabbedPaneUI basicTabbedPaneUI = new BasicTabbedPaneUI();
        basicTabbedPaneUI.setSynthTabbedPaneUI(synthTabbedPaneUI);
        tabbedPane.setUI(basicTabbedPaneUI);

        frame.getContentPane().add(tabbedPane);
        frame.setVisible(true);
    }
}
