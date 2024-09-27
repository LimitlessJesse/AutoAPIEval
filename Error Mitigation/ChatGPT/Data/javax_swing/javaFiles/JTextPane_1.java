import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;

public class JTextPane_1 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        
        // Create attributes
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        attributes.addAttribute(AttributeSet.NameAttribute, "value");
        
        // Apply attributes to text content
        textPane.setCharacterAttributes(attributes, true);
    }
}
