import javax.swing.*;
import javax.swing.plaf.basic.BasicEditorPaneUI;

public class BasicEditorPaneUI_1 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        BasicEditorPaneUI basicEditorPaneUI = new BasicEditorPaneUI();
        basicEditorPaneUI.installUI(editorPane);
    }
}
