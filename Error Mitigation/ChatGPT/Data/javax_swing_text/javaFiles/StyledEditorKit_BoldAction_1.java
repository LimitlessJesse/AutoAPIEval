import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_BoldAction_1 {
    public static void main(String[] args) {
        StyledEditorKit.BoldAction boldAction = new StyledEditorKit.BoldAction();
        boldAction.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Toggle Bold"));
    }
}
