import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_ItalicAction_3 {
    public static void main(String[] args) {
        StyledEditorKit.ItalicAction italicAction = new StyledEditorKit.ItalicAction();
        italicAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Toggle Italic"));
    }
}
