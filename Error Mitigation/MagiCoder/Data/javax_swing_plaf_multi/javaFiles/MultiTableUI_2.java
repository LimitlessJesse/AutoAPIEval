import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTableUI;

public class MultiTableUI_2 {
    public static void main(String[] args) {
        MultiTableUI multiTableUI = new MultiTableUI();
        JComponent jComponent = new JComponent();
        multiTableUI.installUI(jComponent);
    }
}
