import javax.swing.Icon;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

public class JTextPane_4 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        Icon icon = null; // Your icon object
        
        insertIcon(textPane, icon);
    }
    
    public static void insertIcon(JTextPane textPane, Icon icon) {
        Style style = textPane.addStyle("icon", null);
        StyleConstants.setIcon(style, icon);
        try {
            textPane.getDocument().insertString(textPane.getDocument().getLength(), " ", style);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
