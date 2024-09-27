import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_PasteAction_1 {
    public static void main(String[] args) {
        DefaultEditorKit.PasteAction pasteAction = new DefaultEditorKit.PasteAction();
        pasteAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Paste"));
    }
}
