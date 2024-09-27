import javax.swing.text.DefaultEditorKit.CopyAction;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_CopyAction_1 {
    public static void main(String[] args) {
        CopyAction copyAction = new DefaultEditorKit.CopyAction();
        ActionEvent event = new ActionEvent(copyAction, ActionEvent.ACTION_PERFORMED, null);
        copyAction.actionPerformed(event);
    }
}
