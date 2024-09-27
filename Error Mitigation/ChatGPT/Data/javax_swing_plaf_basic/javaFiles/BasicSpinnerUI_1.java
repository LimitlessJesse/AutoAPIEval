import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSpinnerUI;

public class BasicSpinnerUI_1 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        BasicSpinnerUI ui = new BasicSpinnerUI();
        ui.installUI(spinner);
    }
}
