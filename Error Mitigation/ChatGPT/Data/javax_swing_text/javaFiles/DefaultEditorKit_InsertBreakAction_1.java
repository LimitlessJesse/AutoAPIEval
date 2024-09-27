import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_InsertBreakAction_1 {
    public static void main(String[] args) {
        DefaultEditorKit.InsertBreakAction insertBreakAction = new DefaultEditorKit.InsertBreakAction();
        insertBreakAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Insert Break"));
    }
}
