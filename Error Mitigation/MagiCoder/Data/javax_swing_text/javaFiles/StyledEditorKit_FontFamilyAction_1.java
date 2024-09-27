import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;

public class StyledEditorKit_FontFamilyAction_1 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        StyledEditorKit.FontFamilyAction fontFamilyAction = new StyledEditorKit.FontFamilyAction("Arial", editorPane);
        fontFamilyAction.actionPerformed(new ActionEvent(editorPane, ActionEvent.ACTION_PERFORMED, null));
    }
}
