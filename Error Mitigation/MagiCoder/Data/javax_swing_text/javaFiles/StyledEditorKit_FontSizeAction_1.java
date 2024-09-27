import javax.swing.text.StyledEditorKit;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.event.ActionEvent;

public class StyledEditorKit_FontSizeAction_1 {
    public static void main(String[] args) {
        StyledEditorKit.FontSizeAction action = new StyledEditorKit.FontSizeAction("Arial", 12);
        action.actionPerformed(new ActionEvent(this, 0, ""));
    }
}
