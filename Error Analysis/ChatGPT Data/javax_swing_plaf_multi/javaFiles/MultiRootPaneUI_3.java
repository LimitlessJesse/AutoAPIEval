import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiRootPaneUI;

public class MultiRootPaneUI_3 {
    public static void main(String[] args) {
        MultiRootPaneUI multiRootPaneUI = new MultiRootPaneUI();
        ComponentUI[] uis = multiRootPaneUI.getUIs(multiRootPaneUI);
        for(ComponentUI ui : uis) {
            System.out.println(ui.getClass().getName());
        }
    }
}
