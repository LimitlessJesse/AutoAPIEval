import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

public class SplitPaneUI_3 {
    public static void main(String[] args) {
        JSplitPane jc = new JSplitPane();
        SplitPaneUI ui = jc.getUI();
        int dividerLocation = ui.getDividerLocation(jc);
        System.out.println("Divider location: " + dividerLocation);
    }
}
