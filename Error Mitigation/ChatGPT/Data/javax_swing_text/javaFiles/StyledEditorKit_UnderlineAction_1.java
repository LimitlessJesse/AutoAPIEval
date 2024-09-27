import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_UnderlineAction_1 {
    public static void main(String[] args) {
        StyledEditorKit.UnderlineAction underlineAction = new StyledEditorKit.UnderlineAction("Underline", false);
        underlineAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Toggle Underline"));
    }
}
