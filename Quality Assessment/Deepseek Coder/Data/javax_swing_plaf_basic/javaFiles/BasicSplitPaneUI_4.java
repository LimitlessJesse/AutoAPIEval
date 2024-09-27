import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class BasicSplitPaneUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JSplitPane splitPane = new JSplitPane();
        JTextArea left = new JTextArea(10, 20);
        JTextArea right = new JTextArea(10, 20);
        splitPane.setLeftComponent(left);
        splitPane.setRightComponent(right);

        BasicSplitPaneUI splitPaneUI = (BasicSplitPaneUI) splitPane.getUI();
        splitPaneUI.setContinuousLayout(true);

        frame.getContentPane().add(splitPane);
        frame.setVisible(true);
    }
}
