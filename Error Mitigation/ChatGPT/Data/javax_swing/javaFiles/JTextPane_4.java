import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;

public class JTextPane_4 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        AttributeSet attr = new SimpleAttributeSet();
        ((SimpleAttributeSet) attr).addAttribute("font-size", 12);
        textPane.setParagraphAttributes(attr, true);
    }
}
