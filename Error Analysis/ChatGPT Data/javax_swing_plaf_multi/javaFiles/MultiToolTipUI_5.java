import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiToolTipUI;

public class MultiToolTipUI_5 {
    public static void main(String[] args) {
        MultiToolTipUI ui = new MultiToolTipUI();
        ComponentUI[] uis = ui.getUIs();
        for (ComponentUI componentUI : uis) {
            System.out.println(componentUI.toString());
        }
    }
}
