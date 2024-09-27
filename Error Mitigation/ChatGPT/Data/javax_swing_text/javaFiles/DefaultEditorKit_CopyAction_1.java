import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_CopyAction_1 {
    public static void main(String[] args) {
        DefaultEditorKit.CopyAction copyAction = new DefaultEditorKit.CopyAction();
        copyAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Copy"));
    }
}
