import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTreeUI;

public class MultiTreeUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent
        MultiTreeUI multiTreeUI = new MultiTreeUI(); // Creating an instance of MultiTreeUI
        multiTreeUI.uninstallUI(component); // Calling the uninstallUI method
    }
}
