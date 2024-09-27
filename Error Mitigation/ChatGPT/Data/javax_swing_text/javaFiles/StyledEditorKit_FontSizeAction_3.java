import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_FontSizeAction_3 {
    public static void main(String[] args) {
        StyledEditorKit.FontSizeAction fontSizeAction = new StyledEditorKit.FontSizeAction("Font Size", 12);
        fontSizeAction.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Set font size"));
    }
}
