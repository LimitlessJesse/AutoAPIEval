import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_FontFamilyAction_3 {
    public static void main(String[] args) {
        StyledEditorKit.FontFamilyAction fontFamilyAction = new StyledEditorKit.FontFamilyAction("FontFamilyAction", "Arial");
        fontFamilyAction.actionPerformed(new ActionEvent(new Object(), ActionEvent.ACTION_PERFORMED, "Set Font Family"));
    }
}
