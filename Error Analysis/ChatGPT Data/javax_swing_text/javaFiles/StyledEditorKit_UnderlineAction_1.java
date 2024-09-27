import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.UnderlineAction;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class StyledEditorKit_UnderlineAction_1 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        StyledEditorKit styledEditorKit = new StyledEditorKit();
        Action underlineAction = styledEditorKit.getAction(StyledEditorKit.UnderlineAction);
        
        ActionEvent actionEvent = new ActionEvent(textPane, ActionEvent.ACTION_PERFORMED, "");

        underlineAction.actionPerformed(actionEvent);
    }
}
