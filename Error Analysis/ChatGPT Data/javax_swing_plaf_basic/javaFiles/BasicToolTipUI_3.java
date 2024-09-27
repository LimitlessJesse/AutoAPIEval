import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_3 {
    public static void main(String[] args) {
        // create a sample JComponent
        JComponent component = new JComponent() {};

        // create an instance of BasicToolTipUI
        BasicToolTipUI tooltipUI = new BasicToolTipUI();

        // call the installUI method to install the UI for the component
        tooltipUI.installUI(component);
    }
}
