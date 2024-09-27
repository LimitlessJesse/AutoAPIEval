import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_ForegroundAction_3 {
    public static void main(String[] args) {
        StyledEditorKit.ForegroundAction foregroundAction = new StyledEditorKit.ForegroundAction("Set Foreground Color", null);
        ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Set Foreground Color");
        foregroundAction.actionPerformed(e);
    }
}
