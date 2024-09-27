import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

public class SplitPaneUI_5 {
    public static void main(String[] args) {
        JSplitPane jc = new JSplitPane();
        SplitPaneUI ui = jc.getUI();
        if (ui instanceof SplitPaneUI) {
            ((SplitPaneUI) ui).resetToPreferredSizes(jc);
        }
    }
}
