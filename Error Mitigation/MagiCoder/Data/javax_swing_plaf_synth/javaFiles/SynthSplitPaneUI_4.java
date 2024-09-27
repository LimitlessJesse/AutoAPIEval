import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthSplitPaneUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setDividerLocation(150);
        splitPane.setLeftComponent(new JLabel("Left"));
        splitPane.setRightComponent(new JLabel("Right"));

        SynthSplitPaneUI splitPaneUI = new SynthSplitPaneUI();
        splitPaneUI.installUI(splitPane);
        splitPaneUI.update(splitPane.getGraphics(), splitPane);

        frame.getContentPane().add(splitPane);
        frame.setVisible(true);
    }
}
