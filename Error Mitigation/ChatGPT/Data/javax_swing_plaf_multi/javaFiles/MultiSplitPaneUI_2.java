import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiSplitPaneUI;

public class MultiSplitPaneUI_2 {
    public static void main(String[] args) {
        MultiSplitPaneUI multiSplitPaneUI = new MultiSplitPaneUI();
        ComponentUI[] uis = multiSplitPaneUI.getUIs();
        for(ComponentUI ui : uis) {
            System.out.println(ui.toString());
        }
    }
}
