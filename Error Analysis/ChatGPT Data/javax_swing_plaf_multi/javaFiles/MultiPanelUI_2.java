import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiPanelUI;

public class MultiPanelUI_2 {
    public static void main(String[] args) {
        MultiPanelUI multiPanelUI = new MultiPanelUI();
        ComponentUI[] uis = multiPanelUI.getUIs();
        for (ComponentUI ui : uis) {
            System.out.println(ui);
        }
    }
}
