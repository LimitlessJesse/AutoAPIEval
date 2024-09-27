import javax.swing.text.DefaultEditorKit.InsertContentAction;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_InsertContentAction_1 {
    public static void main(String[] args) {
        InsertContentAction action = new InsertContentAction("Insert Content", null);
        action.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Insert Content"));
    }
}
