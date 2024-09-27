import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_DefaultKeyTypedAction_1 {
    public static void main(String[] args) {
        DefaultKeyTypedAction keyTypedAction = new DefaultKeyTypedAction();
        keyTypedAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Key Typed"));
    }
}
