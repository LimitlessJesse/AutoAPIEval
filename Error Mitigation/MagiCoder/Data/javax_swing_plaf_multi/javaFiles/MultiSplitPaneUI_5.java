import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiSplitPaneUI;

public class MultiSplitPaneUI_5 {
    public static void main(String[] args) {
        MultiSplitPaneUI multiSplitPaneUI = new MultiSplitPaneUI();
        JComponent jComponent = new JComponent();
        multiSplitPaneUI.installUI(jComponent);
    }
}
