import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JScrollPane_2 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // Set the horizontal scroll bar policy to NEVER
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    }
}
