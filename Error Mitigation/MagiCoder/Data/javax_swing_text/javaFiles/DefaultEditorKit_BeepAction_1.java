import javax.swing.text.DefaultEditorKit;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_BeepAction_1 {
    public static void main(String[] args) {
        DefaultEditorKit.BeepAction beepAction = new DefaultEditorKit.BeepAction();
        beepAction.actionPerformed(new ActionEvent(this, 0, ""));
    }
}
