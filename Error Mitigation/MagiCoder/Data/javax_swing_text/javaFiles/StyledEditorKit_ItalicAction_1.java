import javax.swing.text.StyledEditorKit;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.JTextComponent;
import javax.swing.text.Element;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;

public class StyledEditorKit_ItalicAction_1 {
    public static void main(String[] args) {
        // Create a JTextComponent (e.g., JTextArea)
        JTextComponent textComponent = new JTextComponent() {
            // Implement necessary methods
        };

        // Create an ItalicAction
        StyledEditorKit.ItalicAction italicAction = new StyledEditorKit.ItalicAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the current selection
                Element element = textComponent.getDocument().getDefaultRootElement();
                int start = textComponent.getSelectionStart();
                int end = textComponent.getSelectionEnd();

                // Get the current style
                Style style = textComponent.getStyle(start);

                // Toggle the italic attribute
                boolean isItalic = style.addAttribute(StyleConstants.FontFamily, "Arial", start, end);
                if (isItalic) {
                    style.removeAttribute(StyleConstants.Italic, start, end);
                } else {
                    style.addAttribute(StyleConstants.Italic, true, start, end);
                }

                // Update the document
                try {
                    textComponent.getDocument().setCharacterAttributes(start, end - start, style, false);
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        };

        // Use the italicAction
        italicAction.actionPerformed(null);
    }
}
