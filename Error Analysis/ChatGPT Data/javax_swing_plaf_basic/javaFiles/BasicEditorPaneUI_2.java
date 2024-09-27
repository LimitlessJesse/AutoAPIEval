import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.JComponent;

public class BasicEditorPaneUI_2 {
    public static void main(String[] args) {
        // Create an instance of BasicEditorPaneUI
        BasicEditorPaneUI editorPaneUI = new BasicEditorPaneUI();

        // Create a JComponent
        JComponent component = new JComponent() {};

        // Call uninstallUI method
        editorPaneUI.uninstallUI(component);
    }
}
