import javax.swing.text.JTextComponent;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;

public class StyledEditorKit_BoldAction_1 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            // Implement the necessary methods here
        };

        StyledEditorKit.BoldAction boldAction = new StyledEditorKit.BoldAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    StyledDocument doc = textComponent.getStyledDocument();
                    int p0 = textComponent.getSelectionStart();
                    int p1 = textComponent.getSelectionEnd();
                    Style style = textComponent.getSelectionModel().getSelectionPath().getStyle(p0);
                    boolean isBold = StyleConstants.getBold(style);
                    Style newStyle = doc.getStyle(StyleConstants.BOLD);
                    if (newStyle == null) {
                        newStyle = doc.addStyle("Bold", null);
                        StyleConstants.setBold(newStyle, true);
                    }
                    doc.remove(p0, p1 - p0);
                    doc.insertString(p0, textComponent.getText(p0, p1 - p0), newStyle);
                    textComponent.setCaretPosition(p0);
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        };

        boldAction.actionPerformed(new ActionEvent(this, 0, ""));
    }
}
