import javax.swing.JEditorPane;
import javax.swing.plaf.basic.BasicEditorPaneUI;

public class BasicEditorPaneUI_2 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        BasicEditorPaneUI basicEditorPaneUI = new BasicEditorPaneUI();
        basicEditorPaneUI.uninstallUI(editorPane);
    }
}
