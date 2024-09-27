import javax.swing.*;
import javax.swing.plaf.ComponentUI;

public class SynthListUI_2 {
    public static void main(String[] args) {
        JList list = new JList();
        ComponentUI ui = SynthListUI.createUI(list);
        System.out.println(ui);
    }
}
