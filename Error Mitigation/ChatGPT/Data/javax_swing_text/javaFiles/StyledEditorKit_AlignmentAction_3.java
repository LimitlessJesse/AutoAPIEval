import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_AlignmentAction_3 {
    public static void main(String[] args) {
        StyledEditorKit.AlignmentAction alignmentAction = new StyledEditorKit.AlignmentAction("Align Center", StyledEditorKit.AlignmentAction.ALIGN_CENTER);
        alignmentAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Align Center"));
    }
}
