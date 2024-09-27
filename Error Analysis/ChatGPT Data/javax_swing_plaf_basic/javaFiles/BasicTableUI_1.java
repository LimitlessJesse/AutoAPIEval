import javax.swing.*;
import javax.swing.plaf.basic.BasicTableUI;

public class BasicTableUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        BasicTableUI ui = new BasicTableUI();
        ui.installUI(component);
    }
}
