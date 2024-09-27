import javax.swing.text.StyledEditorKit;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.JTextComponent;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class StyledEditorKit_ForegroundAction_1 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            // Implement the JTextComponent methods here
        };

        StyledEditorKit.ForegroundAction foregroundAction = new StyledEditorKit.ForegroundAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Style style = textComponent.getStyle(textComponent.getSelectionStart());
                Color oldColor = (Color) style.getAttribute(StyleConstants.Foreground);
                Color newColor = oldColor == Color.black? Color.red : Color.black;
                style.addAttribute(StyleConstants.Foreground, newColor);
            }
        };

        foregroundAction.actionPerformed(null);
    }
}
