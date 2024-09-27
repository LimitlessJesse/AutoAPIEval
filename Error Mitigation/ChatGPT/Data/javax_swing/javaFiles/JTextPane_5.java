import javax.swing.JTextPane;
import javax.swing.text.Style;

public class JTextPane_5 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        Style logicalStyle = textPane.addStyle("LogicalStyle", null);
        textPane.setLogicalStyle(logicalStyle);
    }
}
