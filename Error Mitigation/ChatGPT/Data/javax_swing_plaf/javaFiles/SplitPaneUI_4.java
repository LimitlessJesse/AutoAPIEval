import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

public class SplitPaneUI_4 {
    public static void main(String[] args) {
        JSplitPane jc = new JSplitPane();
        SplitPaneUI ui = jc.getUI();
        int maxDividerLocation = ui.getMaximumDividerLocation(jc);
        System.out.println("Maximum Divider Location: " + maxDividerLocation);
    }
}
