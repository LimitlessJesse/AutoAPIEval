import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_CutAction_1 {
    public static void main(String[] args) {
        DefaultEditorKit.CutAction cutAction = new DefaultEditorKit.CutAction();
        ActionEvent actionEvent = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Cut");
        cutAction.actionPerformed(actionEvent);
    }
}
